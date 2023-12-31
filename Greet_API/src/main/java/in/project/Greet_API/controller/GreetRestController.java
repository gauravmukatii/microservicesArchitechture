package in.project.Greet_API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class GreetRestController {

    @Autowired
    private Environment env;

    @GetMapping("/greet")
    public String getGreetMsg(){
//        RestTemplate rt = new RestTemplate();
//        ResponseEntity<String> responseEntity = rt.getForEntity("http://localhost:8082/welcome", String.class);
//        String welcomeResponse = responseEntity.getBody();

//        WebClient webClient = WebClient.create();
//        String welcomeResponse = webClient.get()
//                .uri("http://localhost:8082/welcome")
//                .retrieve()
//                .bodyToMono(String.class)
//                .block();

        String port = env.getProperty("server.port");
        return "Hello We are running on port : " + port;
    }
}
