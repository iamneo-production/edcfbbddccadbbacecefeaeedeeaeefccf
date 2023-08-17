package com.example.Controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class ApiController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring Boot!";
    }
}
