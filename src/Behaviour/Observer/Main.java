package Behaviour.Observer;

public class Main {
    public static void main(String[] args) {
        PublisherFileBasedNotification publisherFileBasedNotification = new PublisherFileBasedNotification();
        publisherFileBasedNotification.publisherBaseClass.addSubscriber("open",new EmailBasedNotification("prateeksri@yahooo.com"));
        publisherFileBasedNotification.publisherBaseClass.addSubscriber("open",new SmsBasedNotification("111111111111"));
        publisherFileBasedNotification.publisherBaseClass.addSubscriber("save",new SmsBasedNotification("90000000000"));
        publisherFileBasedNotification.openFile("Java");
        publisherFileBasedNotification.saveFile("Kotlin");

    }
}
