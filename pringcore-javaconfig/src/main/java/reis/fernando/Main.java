package reis.fernando;

import reis.fernando.service.EmailService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import reis.fernando.config.AppConfig;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailService emailService = context.getBean("emailService", EmailService.class);
        emailService.sendEmail("fmreis@gmail.com", "Hello from Java Config ApllicationContext");
    }
}