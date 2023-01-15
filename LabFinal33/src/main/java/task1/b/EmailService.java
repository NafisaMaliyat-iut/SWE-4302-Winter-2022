package task1.b;

//code smell: lazy class
public class EmailService {
    static void Send(String subject, String body, String to, String from,
                     String cc){}
    static void Send(String subject, String body, String to, String from,
                     String cc, boolean sendImmediately){}
}
