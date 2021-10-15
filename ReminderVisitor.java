public class ReminderVisitor extends NodeVisitor {

    @Override
    void visitCourse(ClassCourseList course) {
        System.out.println("Visit Each assignment in the list to RemindVisitor");
        // TODO Add Assignment class
    }

}
