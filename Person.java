public abstract class Person {
    CourseMenu theCourseMenu;

    abstract void showMenu();

    abstract void createMenu();

    abstract void showAddButton();

    abstract void showViewButton();

    abstract void showLabels();

    abstract void showRadioButton();

    abstract void show();

    public static Person createPersonInstance(String role, int courseLevel) {

        System.out.println("*********************Factory Pattern**************************");
        System.out.println("Initializing player based on user type and course menu selected");
        Person p = null;
        switch (role) {
            case "student":
                switch (courseLevel) {
                    case 0:
                        p = new Student(new HighLevelCourseMenu());
                        break;
                    case 1:
                        p = new Student(new LowLevelCourseMenu());
                        break;
                }
                break;
            case "instructor":
                switch (courseLevel) {
                    case 0:
                        p = new Instructor(new HighLevelCourseMenu());
                        break;
                    case 1:
                        p = new Instructor(new LowLevelCourseMenu());
                        break;
                }
                break;
        }
        return p;
    }
}
