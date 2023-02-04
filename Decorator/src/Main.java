public class Main {
    public static void main(String[] args) {
        var base = new BaseDecorator(new Passport(new Insurance()));
        System.out.println(base.getText());
    }
}