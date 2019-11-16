package reis.fernando.service;

public class EmailService {
    
    public void sendEmail(String receiver, String message){
        System.out.println(message + " is been sent to " + receiver);
    }
}
