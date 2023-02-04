import java.util.ArrayList;

public class EventManager {
    private final ArrayList<MyEventListener> posts;
    
    public EventManager() {
        posts = new ArrayList<MyEventListener>();
    }
    
    public void addSubscriber(MyEventListener post) {
        posts.add(post);
    }
    
    public void removeSubscriber(MyEventListener post) {
        posts.remove(post);
    }

    public void notifyByEvent(Events event) {
        for (var item : posts) {
            if (item.isOnThisEvent(event)) {
                item.myNotify();
            }
        }
    }
}
