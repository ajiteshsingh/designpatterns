import java.util.Scanner;
import java.util.*;

public class Facade {
    static List<User> users = new ArrayList<User>();
    int UserType;
    Person thePerson;
    List<String> theCoursesList;
    String theSelectedCourse;
    int nCourseLevel;

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

        System.out.println("Attaching course to the user " + user.getUsername());
        Readfile f = new Readfile();
        theCoursesList = f.readCourses("CourseInfo.txt");

        showCourses(theCoursesList);

        System.out.print("Choose a Course");

        int index = Integer.parseInt(scanner.nextLine());
        theSelectedCourse = theCoursesList.get(index);

        Util.showCoursesLevels();

        nCourseLevel = Integer.parseInt(scanner.nextLine());

        System.out.println("Choose 0 or 1");

        System.out.println("Course Selected : " + theSelectedCourse);

        thePerson = PersonFactory.createPersonInstance(user.getRole(), nCourseLevel);

        thePerson.showMenu();

        int option = Integer.parseInt(scanner.nextLine());

    }

    public void showCourses(List<String> courses) {
        System.out.println("Course List:");
        CourseIterator itr = new CourseIterator(theCoursesList);
        int count = 0;
        while (itr.hasNext()) {
            System.out.println(count + ":" + itr.next());
            count++;
        }
    }

    public User login() {
        Login loginUtil = new Login();
        return loginUtil.login(scanner, users);
    }
}