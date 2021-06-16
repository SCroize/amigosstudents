package com.example.amigosstudents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //Makes this class to serve as REST Endpoints
public class AmigosstudentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmigosstudentsApplication.class, args);
    }

}
