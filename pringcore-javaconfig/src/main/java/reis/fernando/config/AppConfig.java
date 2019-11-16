package reis.fernando.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reis.fernando.service.EmailService;

@Configuration
public class AppConfig {
    
    @Bean
    EmailService emailService(){
        return new EmailService();
    } 
}
