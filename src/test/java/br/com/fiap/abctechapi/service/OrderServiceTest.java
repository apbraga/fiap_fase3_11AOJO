package br.com.fiap.abctechapi.service;

import br.com.fiap.abctechapi.entity.Assistance;
import br.com.fiap.abctechapi.entity.Order;
import br.com.fiap.abctechapi.handler.exception.MaximumAssistException;
import br.com.fiap.abctechapi.handler.exception.MinimumAssistRequiredException;
import br.com.fiap.abctechapi.repository.AssistanceRepository;
import br.com.fiap.abctechapi.repository.OrderRepository;
import br.com.fiap.abctechapi.service.impl.OrderServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class OrderServiceTest {
    @MockBean
    private AssistanceRepository assistanceRepository;
    @MockBean
    private OrderRepository orderRepository;
    private OrderService orderService;
    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        orderService = new OrderServiceImpl(assistanceRepository, orderRepository);
        Mockito.when(assistanceRepository.findById(Mockito.any())).thenReturn(Optional.of(new Assistance(1L, "Teste", "Teste Description")));
    }

    // test for _saveOrder_ when a list is empty
    @Test
    void test_save_order_empty_list() {
        Order newOrder = new Order();
        newOrder.setOperatorId(1234L);
        Assertions.assertThrows(MinimumAssistRequiredException.class, () -> orderService.saveOrder(newOrder, List.of()));
        Mockito.verify(orderRepository, Mockito.times(0)).save(newOrder);
    }
    // test for saveOrder when a list has more than 15 elements
    @Test
    void test_save_order_over_15_items(){
        Order newOrder = new Order();
        newOrder.setOperatorId(1234L);
        Assertions.assertThrows(MaximumAssistException.class, () -> orderService.saveOrder(newOrder, List.of(1L,2L,3L,4L,5L,6L,7L,8L,9L,10L,
                11L,12L,13L,14L,15L,16L)));
        Mockito.verify(orderRepository, Mockito.times(0)).save(newOrder);
    }
    // test for saveOrder on happy path
    @Test
    void test_save_order_success(){
        Order newOrder = new Order();
        newOrder.setOperatorId(1234L);
        Assertions.assertDoesNotThrow(() -> orderService.saveOrder(newOrder, List.of(1L,2L,3L,4L,5L,6L,7L,8L,9L,10L,
                11L,12L,13L,14L,15L)));
        Mockito.verify(orderRepository, Mockito.times(1)).save(newOrder);
    }

}
