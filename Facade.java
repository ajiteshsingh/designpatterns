import java.util.Scanner;

public class Facade {
    public Facade() {
        System.out.println("*********Facade Design Pattern**************");
        System.out.println("Facade is a single interface to the more general facilities of other subsystems");
    }

    public void login() {
        System.out.print("Enter Username:");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.print("Enter Password:");
        String password = scanner.nextLine();
    }
}