package com.example.demo.utility.property;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@RequiredArgsConstructor
@PropertySource(value = {"classpath:redis.properties"})
public class PropertyUtil {

    final private Environment environment;
    public String getProperty(String key) {
        return environment.getProperty(key);
    }
}