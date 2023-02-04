public class Main {
    public static void main(String[] args) {
        EventManager manager = new EventManager();
        manager.addSubscriber(new TrafficPolicePost(1, Events.BRIBERY));
        manager.addSubscriber(new TrafficPolicePost(2, Events.SPEED_OVER));
        manager.notifyByEvent(Events.BRIBERY);
    }
}