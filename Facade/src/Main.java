import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        var facade = new Facade();
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to SHUT DOWN YOUR PC (not kidding)\n" +
                "Press anything else to REBOOT YOUR PC (NOT A JOKE !!!!)");
        int operation = sc.nextInt();
        facade.setOperation(operation == 1 ? Operations.SHUT_DOWN : Operations.REBOOT);
        facade.activateOperation();
    }
}