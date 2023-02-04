public class PrintWithoutSpaces implements Strategy {
    public void print(String text) {
        text = text.replaceAll("\\s+","");
        System.out.println(text);
    }
}