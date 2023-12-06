package in.springboot.Redis_Cache.rest;

import in.springboot.Redis_Cache.binding.Country;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Map;

@RestController
public class CountryRestController {

    private HashOperations<String, Object, Object> opsForHash = null;
    public CountryRestController(RedisTemplate<String, Country> rt){
         this.opsForHash = rt.opsForHash();
    }

    @PostMapping("/country")
    public String addCountry(@RequestBody Country country){
        opsForHash.put("COUNTRIES", country.getSno(), country);
        return "Country Added";
    }

    @GetMapping("/countries")
    public Collection<Object> getCountries(){
        Map<Object, Object> entries = opsForHash.entries("COUNTRIES");
        Collection<Object> values = entries.values();
        return values;
    }


}
