public class PrintInDifferentLines implements Strategy {
    public void print(String text) {
        var array = text.split(" ");
        for (var item : array) {
            System.out.println(item);
        }
    }
}
