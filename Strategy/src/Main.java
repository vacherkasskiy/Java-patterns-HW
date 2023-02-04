public class Main {
    public static void main(String[] args) {
        // Вариант 1 (Паттерн стратегия)
        Printer printer = new Printer("dofbndfob dofibndfoibn dofnbdiofb");

        printer.setStrategy(new PrintInOneLine());
        printer.print();

        printer.setStrategy(new PrintInDifferentLines());
        printer.print();

        printer.setStrategy(new PrintWithoutSpaces());
        printer.print();
    }
}