package org.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/Hello")
    public String home() {
        return "Hello from Spring Boot on Azure Lalith Chandra!!";
    }
}
