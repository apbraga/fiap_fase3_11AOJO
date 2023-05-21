package br.com.fiap.abctechapi.model;
import br.com.fiap.abctechapi.entity.Order;
import br.com.fiap.abctechapi.entity.OrderLocation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderTest {

    @Test
    void test_not_null() {
        Order order = new Order();
        Assertions.assertNotNull(order);
    }

    @Test
    void test_not_end_order_location() {
        Order order = new Order();
        order.setEndOrderLocation(new OrderLocation());
        Assertions.assertNotNull(order.getEndOrderLocation());
    }

    @Test
    void test_not_start_order_location() {
        Order order = new Order();
        order.setStartOrderLocation(new OrderLocation());
        Assertions.assertNotNull(order.getStartOrderLocation());
    }
}