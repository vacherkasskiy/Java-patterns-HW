// Интерфейс для того, чтобы класс-издатель мог оповещать
// объекты разных классов (в нашем случае только один класс,
// но почему бы всё равно не написать интерфейс?).
public interface MyEventListener {
    void myNotify();
    boolean isOnThisEvent(Events event);
}