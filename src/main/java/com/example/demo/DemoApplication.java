package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

    @Value("${APP_TITLE}")
    private String title;

    @RequestMapping("/")
    String home() {
        return String.format("title: %s message: %s",title, "Hello World! test da luciano grippa modificato il 23/11/2021 ore 09:51");
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
