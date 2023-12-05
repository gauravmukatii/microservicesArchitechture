package in.project.Greet_API.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

    @GetMapping("/greet")
    public String getGreetMsg(){
        return "Hello We are learning microservices";
    }
}
