import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Readfile {

    public List<User> readCreds(String filename, String role) {
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

    public List<String> readCourses(String filename) {
        List<String> coursesList = new ArrayList<String>();
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                coursesList.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
        return coursesList;
    }
}