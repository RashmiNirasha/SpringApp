package com.example.SpringTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // This annotation makes this class a REST controller
public class SpringTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTwoApplication.class, args);
    }

    // This method handles GET requests to the root URL ("/")
    @GetMapping("/")
    public String welcome() {
        return "Welcome to SpringTwo Application!";
    }
}
