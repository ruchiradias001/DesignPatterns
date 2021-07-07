package behavioral.observe;

public class bObserveMain {
    public static void main(String[] args) {
        Channel channel = new Channel("Channel");

        Subscriber s1 = new Subscriber("Subscriber 1");
        Subscriber s2 = new Subscriber("Subscriber 2");
        Subscriber s3 = new Subscriber("Subscriber 3");

        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);

        channel.upload("Design Pattern");

        System.out.println("s3 subscribed a channel --> " + s3.isSubscribed());
        
        channel.unsubscribe(s3);

        channel.upload("Observe Design Pattern");

        System.out.println("s3 subscribed a channel --> " + s3.isSubscribed());

    }
}
