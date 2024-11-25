package com.study.javastudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig{

    @Bean
    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // 모든 경로에 대해 CORS 적용
                        .allowedOrigins("http://localhost:5173") // 허용할 도메인
                        .allowedMethods("GET","POST","PUT","DELETE") // 허용할 메소드
                        .allowedHeaders("*") // 모든 헤더 허용
                        .allowCredentials(true); // 쿠키전송허용
            }
        };
    }
}