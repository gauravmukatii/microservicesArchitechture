package in.springboot.Redis_Cache.binding;

import lombok.Data;

import java.io.Serializable;

@Data
public class Country implements Serializable {
    private Integer sno;
    private String countryName;
    private String countryCode;
}
