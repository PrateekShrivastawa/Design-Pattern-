package Behaviour.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublisherBaseClass {
    Map<String, List<EventSubscriber>> eventBySubscriber = new HashMap<>();

    public PublisherBaseClass(String ... s) {
        for(int i=0;i<s.length;i++){
            eventBySubscriber.put(s[i],new ArrayList<>());
        }
    }

    public void addSubscriber(String eventName, EventSubscriber eventSubscriber){
        List<EventSubscriber> subscriberListByEvent = eventBySubscriber.get(eventName);
        subscriberListByEvent.add(eventSubscriber);
    }

    public void removeSubscriber(String eventName,EventSubscriber eventSubscriber){
        List<EventSubscriber> subscriberListByEvent = eventBySubscriber.get(eventName);
        subscriberListByEvent.remove(eventSubscriber);
    }

    public void notifySubscriber(String eventName,String fileName){
        List<EventSubscriber> subscriberListByEvent = eventBySubscriber.get(eventName);
        for(EventSubscriber eventSubscriber:subscriberListByEvent){
            eventSubscriber.update(eventName,fileName);
        }
    }
}
