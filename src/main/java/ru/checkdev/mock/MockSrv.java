package ru.checkdev.mock;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@OpenAPIDefinition(info = @Info(title = "Mock - interview service", description = "Description"))
@SpringBootApplication
@EnableEurekaClient
public class MockSrv {

    public static void main(String[] args) {
        SpringApplication.run(MockSrv.class, args);
    }

}
