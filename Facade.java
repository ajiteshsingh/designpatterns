import java.util.Scanner;
import java.util.*;

public class Facade {
    static List<User> users = new ArrayList<User>();
    int UserType;

    Scanner scanner = new Scanner(System.in);

    public Facade() {
        System.out.println("*********Facade Design Pattern**************");
        System.out.println("Facade is a single interface to the more general facilities of other subsystems");
        Readfile f = new Readfile();
        users = f.readCreds("InsInfor.txt", "instructor");
        List<User> students = f.readCreds("StuInfo.txt", "student");
        users.addAll(students);
    }

    public void initFacade() {
        User user = login();
        if (user == null) {
            System.out.println("Incorrect username and password, Please try again");
            initFacade();
            return;
        }
        System.out.println("Creating Instance of type " + user.getRole());
        // System.out.println("Attaching Course to the user pepe " + user.getRole());

    }

    public User login() {
        System.out.print("Enter Username:");
        String username = scanner.nextLine();
        System.out.print("Enter Password:");
        String password = scanner.nextLine();
        User u = null;
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                u = user;
            }
        }
        return u;
    }
}