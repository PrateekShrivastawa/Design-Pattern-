package Behaviour.Observer;

public class SmsBasedNotification implements EventSubscriber{
    private String mobileNumber;

    public SmsBasedNotification(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void update(String eventType, String fileName) {
        System.out.println("SMS Sent to "+mobileNumber+" for eventtype "+eventType+" for change in "+fileName);

    }
}
