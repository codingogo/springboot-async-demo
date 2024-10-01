package io.codingogo.asyncontrollerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AsyncControllerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsyncControllerDemoApplication.class, args);
    }

}
