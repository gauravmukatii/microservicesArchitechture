package in.project.Welcome_API.controller;

import in.project.Welcome_API.feign.GreetFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class WelcomeRestController {


    @Autowired
    private GreetFeignClient greetFeignClient;


    @GetMapping("/welcome")
    public String getWelcomeMsg(){

        String greetResponse = greetFeignClient.invokeGreetApi();
        return greetResponse + " " + "Welcome msg";
    }

}
