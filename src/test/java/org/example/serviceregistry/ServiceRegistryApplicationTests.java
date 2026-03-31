package org.example.serviceregistry;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
        "spring.cloud.config.enabled=false"
})
public class ServiceRegistryApplicationTests {
        @Test
        void contextLoads() {

        }
}

