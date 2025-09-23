package com.luv2code.spring_boot_library.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {
    @Bean
    OpenAPI customOpenApi(){
        return new OpenAPI()
            .info(new Info()
                  .title("Full Stack Library")
                  .version("1.0")
                  .description("API Documentation"));
    }
}
