import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Readfile {

    public List<User> readCreds(String filename, String role) {
        System.out.println("Reading file");
        List<User> creds = new ArrayList<User>();
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String c[] = data.split(":");
                User user = new User(c[0], c[1], role);
                creds.add(user);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
        return creds;
    }
}