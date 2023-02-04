public class Printer {
    private Strategy strategy;
    private final String text;
    public Printer(String text) {
        this.text = text;
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void print() {
        strategy.print(text);
    }
}
