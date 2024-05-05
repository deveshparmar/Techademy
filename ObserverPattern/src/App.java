public class App {
    public static void main(String[] args) {
        Channel channel = new Channel("EI");

        Subscriber subscriber1 = new Subscriber("sub1");
        Subscriber subscriber2 = new Subscriber("sub2");
        Subscriber subscriber3 = new Subscriber("sub3");
        Subscriber subscriber4 = new Subscriber("sub4");
        Subscriber subscriber5 = new Subscriber("sub5");

        channel.addSubscriber(subscriber1);
        channel.addSubscriber(subscriber2);
        channel.addSubscriber(subscriber3);
        channel.addSubscriber(subscriber4);

        channel.uploadVideo("EI dialogues ep1");

        channel.removeSubscriber(subscriber4);

        channel.uploadVideo("EI dialogues ep2");
    }
}
