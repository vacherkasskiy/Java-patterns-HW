import java.io.IOException;

public class Facade {
    private Operations operation;
    private final Computer computer;
    public Facade() {
        computer = new Computer();
    }
    public void setOperation(Operations operation) {
        this.operation = operation;
    }
    public void activateOperation() throws IOException {
        if (operation == Operations.REBOOT) {
            computer.reboot();
        } else if (operation == Operations.SHUT_DOWN) {
            computer.shutDown();
        }
    }
}
