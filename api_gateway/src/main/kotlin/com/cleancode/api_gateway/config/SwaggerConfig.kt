package com.cleancode.api_gateway.config

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.context.annotation.Configuration

//http://localhost:8080/swagger-ui/index.html

@OpenAPIDefinition(
    info = Info(title = "API gateway 명세서",
        description = "Batch Service API 명세서",
        version = "0.0.1",
        )
)
@Configuration
class SwaggerConfig {
}