package com.fernando.mathapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    @Bean
    OpenAPI openAPIv1()  {
        return new OpenAPI()
        .info(new Info()
        .title("Math API")
        .contact(new Contact()
        .name("Fernando de Barros")
        .email("fdebarros0910-2004@hotmail.com")
        .url("https://github.com/fernandobarrosd"))
        .description("Mathematic operations"));
    }
}