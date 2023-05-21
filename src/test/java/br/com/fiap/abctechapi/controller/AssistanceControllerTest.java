package br.com.fiap.abctechapi.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AssistanceControllerTest {

    @Autowired
    private AssistanceController assistanceController;

    @Test
    void contextLoads() throws Exception {
        Assertions.assertThat(assistanceController).isNotNull();
    }

}