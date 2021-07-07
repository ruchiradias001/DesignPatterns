package behavioral.observe;

public class Subscriber {
    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String videoTitle) {
        System.out.println(name + " --> Video uploaded: " + videoTitle);
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Channel getChannel() {
        return channel;
    }

    public boolean isSubscribed() {
        if (getChannel() == null) {
            return false;
        }
        return true;
    }
}
