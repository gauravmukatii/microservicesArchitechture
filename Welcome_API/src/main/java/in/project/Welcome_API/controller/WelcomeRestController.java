package in.project.Welcome_API.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class WelcomeRestController {

    @GetMapping("/welcome")
    public String getWelcomeMsg(){
        return "Welcome msg";
    }
}
