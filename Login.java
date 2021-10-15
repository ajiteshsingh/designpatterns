import java.util.*;

public class Login {
    public User login(Scanner scanner, List<User> users) {
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
