public class Student extends Person {

    CourseMenu courseMenu;

    Student(CourseMenu courseMenu) {
        this.courseMenu = courseMenu;
    }

    @Override
    public void showMenu() {
        System.out.println("*****************Choose an operation*****************");
        System.out.println("1. Create Course Menu");
        System.out.println("2. Show Course Menu");
        System.out.println("3. Remind");
        System.out.println("4. logout");
    }

    public void createMenu() {
        courseMenu.showAddButton();
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
}
