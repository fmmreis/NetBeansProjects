package reis.fernando;
import reis.fernando.service.EmailService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import reis.fernando.config.AppConfig;

public class Main {
    public static void main(String[] args) {
        
        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailService emailService1 = context1.getBean("emailService", EmailService.class);
        emailService1.sendEmail("fmreis@gmail.com", "Hello from Annotations Config ApllicationContext using @Component");
        
        ApplicationContext context2 = new ClassPathXmlApplicationContext("spring.xml");
        EmailService emailService2 = context2.getBean("emailService", EmailService.class);
        emailService2.sendEmail("fmreis@gmail.com", "Hello from Annotations Config ApllicationContext using XML");

    }
}