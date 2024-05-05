import java.util.ArrayList;
import java.util.List;

public class Channel implements Observable{
    private String name;
    private List<Observer>subscribers = new ArrayList<>();

    public Channel(String name) {
        this.name = name;
    }

    @Override
    public void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(String title) {
        for(Observer subscriber : subscribers){
            subscriber.update(title);
        }
    }

    public void uploadVideo(String title){
        System.out.println("New video uploaded on channel "+name+" : "+title);
        notifySubscribers(title);
    }
}
