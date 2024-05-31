package se.dsve.movies;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        // TODO: Implement function
        return new OpenAPI()
                   .info(new Info().title("Movies API")
                            .description("This is a simple Movies API")
                            .version("v1.0.0"))
                    .components(new Components()
                            .addSecuritySchemes("bearer-key",
                                    new SecurityScheme()
                                            .type(SecurityScheme.Type.HTTP)
                                            .scheme("bearer")
                                            .bearerFormat("JWT")
                                            .in(SecurityScheme.In.HEADER)
                                            .name("Authorization")))
                    .addSecurityItem(new SecurityRequirement().addList("bearer-key"));
    }
}