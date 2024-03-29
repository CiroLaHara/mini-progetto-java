package com.example.miniprogetto.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.Servers;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name ="Ciro La Hara",
                        email = "ciro.lahara@r2u.it",
                        url = "https://r2u.online/intranet/login"
                ),
                description = "Documentazione per Mini Progetto Java",
                title = "Open Api Mini Progetto Java",
                version = "1.0",
                license =@License(
                        name = "R2U license",
                        url = "https://r2u.com"
                ),
                termsOfService = "Service terms"
        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url="http://localhost:8080"

                ),
                @Server(
                        description = "Prod ENV",
                        url="http://mini_prog_java:8088"

                )
        }
)
public class OpenApiConfig {
}
