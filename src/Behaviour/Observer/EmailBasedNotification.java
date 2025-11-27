package Behaviour.Observer;

public class EmailBasedNotification implements EventSubscriber{
    private String email;

    public EmailBasedNotification(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, String fileName) {
        System.out.println("Email Sent to "+email+" for eventtype "+eventType+" for change in "+fileName);
    }
}
