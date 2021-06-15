package com.example.amigosstudents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController //Makes this class to serve as REST Endpoints
public class AmigosstudentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmigosstudentsApplication.class, args);
    }

    @GetMapping
    public List<String> hello() {
        return List.of("Hello","World");
    }

}
