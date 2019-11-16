package reis.fernando.service;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
    
    public void sendEmail(String receiver, String message){
        System.out.println(message + " is been sent to " + receiver);
    }
}
