public class TrafficPolicePost implements MyEventListener {
    private final int id;
    private final Events event;

    public TrafficPolicePost(int id, Events event) {
        this.id = id;
        this.event = event;
    }

    public void myNotify() {
        if (event == Events.ACCIDENT) {
            System.out.println("Call an ambulance!");
        } else if (event == Events.SPEED_OVER) {
            System.out.println("Slow down!");
        } else if (event == Events.BRIBERY) {
            System.out.println("Idk how to react on that");
        }
    }

    public boolean isOnThisEvent(Events event) {
        return this.event == event;
    }
}