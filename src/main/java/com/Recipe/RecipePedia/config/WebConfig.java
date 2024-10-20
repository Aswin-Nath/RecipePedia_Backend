package com.Recipe.RecipePedia.config; // Adjust the package name accordingly

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(@SuppressWarnings("null") CorsRegistry registry) {
        registry.addMapping("/api/**") // Adjust the mapping as needed
                .allowedOrigins("http://localhost:3000") // Adjust the frontend URL as needed
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowCredentials(true); // If you need to include cookies or HTTP authentication
    }
}
