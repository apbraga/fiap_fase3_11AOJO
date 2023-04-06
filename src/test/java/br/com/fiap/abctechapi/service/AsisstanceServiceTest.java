package br.com.fiap.abctechapi.service;
import br.com.fiap.abctechapi.entity.Assistance;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

@SpringBootTest

public class AsisstanceServiceTest {
    @MockBean
    private AssistanceService assistanceService;
    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void test_lista_assistance() {
        Mockito.when(assistanceService.getAssists()).thenReturn(List.of(new Assistance(1L, "Test", "Test Description")));
        List<Assistance> list = assistanceService.getAssists();
        Assertions.assertNotNull(list);
        Assertions.assertEquals(1, list.size());
    }
}
