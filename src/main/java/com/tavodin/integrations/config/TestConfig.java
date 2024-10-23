package com.tavodin.integrations.config;

import com.tavodin.integrations.services.EmailService;
import com.tavodin.integrations.services.MockEmailService;
import com.tavodin.integrations.services.SendGridEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
}
