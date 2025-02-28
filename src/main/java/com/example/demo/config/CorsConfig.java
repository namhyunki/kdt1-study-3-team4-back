package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration

public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://127.0.0.1:8080",
                        "http://localhost:8080",
                        "http://3.36.251.74", //현기
                        "http://43.201.44.74" //여울
                 )
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
