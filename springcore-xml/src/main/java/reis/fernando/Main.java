package reis.fernando;

import reis.fernando.service.EmailService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        EmailService emailService1 = beanFactory.getBean("emailService", EmailService.class);
        emailService1.sendEmail("fmreis@gmail.com", "Hello from BeanFactory");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmailService emailService = context.getBean("emailService", EmailService.class);
        emailService.sendEmail("fmreis@gmail.com", "Hello from ApllicationContext");        

    }
}