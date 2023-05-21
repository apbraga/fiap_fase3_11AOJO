package br.com.fiap.abctechapi.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HealthCheckControllerTest {

    @Autowired
    private HealthCheckController healthCheckController;

    @Test
    void contextLoads() throws Exception {
        Assertions.assertThat(healthCheckController).isNotNull();
    }

    @Test
    void test_status_success() {
        Assertions.assertThat(healthCheckController.status().getBody()).isEqualTo("UP");
    }
}
