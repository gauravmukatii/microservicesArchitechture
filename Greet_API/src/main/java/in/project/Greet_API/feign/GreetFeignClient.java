package in.project.Greet_API.feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "GREET_API")
public interface GreetFeignClient {

    @GetMapping("/greet")
    public String invokeGreetApi();
}
