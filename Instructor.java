public class Instructor extends Person {
    CourseMenu courseMenu;

    Instructor(CourseMenu courseMenu) {
        this.courseMenu = courseMenu;
    }

    public void createMenu() {
        String c = null;
        if (courseMenu instanceof HighLevelCourseMenu) {
            c = "HighLevelCourseMenu";
        } else {
            c = "LowLevelCourseMenu";
        }
        System.out.println("Create Instructor-Course " + c);
    }

    @Override
    void showAddButton() {
        // TODO Auto-generated method stub

    }

    @Override
    void showViewButton() {
        // TODO Auto-generated method stub

    }

    @Override
    void showLabels() {
        // TODO Auto-generated method stub

    }

    @Override
    void showRadioButton() {
        // TODO Auto-generated method stub

    }

    @Override
    void show() {
        // TODO Auto-generated method stub

    }

    @Override
    void showMenu() {
        System.out.println("****************Bridge Pattern***************");
        System.out.println(
                "CourseMenu is dynamically configured at runtime depending on the type of the course(high level or low level) and the type of the user");
        System.out.println("Show Instructor " + menuType());
    }

    private String menuType() {
        String c = null;
        if (courseMenu instanceof HighLevelCourseMenu) {
            c = "HighLevelCourseMenu";
        } else {
            c = "LowLevelCourseMenu";
        }
        return c;
    }
}
