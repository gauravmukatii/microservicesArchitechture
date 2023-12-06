package in.springboot.Welcome_Api_Config_Client.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

    @Value("${msg1}")
    private String msg1;

    @GetMapping("/welcome")
    public String getWelcomeMsg(){
        return msg1;
    }
}
