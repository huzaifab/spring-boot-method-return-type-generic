package com.tss.generic;
/**
 * @author huzaifa bhavnagri
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("spring-boot-method-return-type-generic Application is started on endpoint http://localhost:8080/generic as default");
    }
}