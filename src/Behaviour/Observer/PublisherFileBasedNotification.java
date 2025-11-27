package Behaviour.Observer;

public class PublisherFileBasedNotification {
    PublisherBaseClass publisherBaseClass;
    String fileName;

    public PublisherFileBasedNotification() {
       this.publisherBaseClass = new PublisherBaseClass("open","save");
    }

    public void openFile(String fileName){
        publisherBaseClass.notifySubscriber("open",fileName);
    }

    public void saveFile(String fileName){
        publisherBaseClass.notifySubscriber("save",fileName);
    }

}
