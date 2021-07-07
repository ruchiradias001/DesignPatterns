package behavioral.observe;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String name;
    private List<Subscriber> subscribers = new ArrayList<>();

    public Channel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void subscribe(Subscriber subscriber) {
        subscriber.setChannel(this);
        subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber) {
        subscriber.setChannel(null);
        subscribers.remove(subscriber);
    }
    private void notification(String videoTitle) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(videoTitle);
        }
    }
    public void upload(String videoTitle) {
        notification(videoTitle);
    }
}
