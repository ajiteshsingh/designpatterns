public class ClassCourseList extends Reminder {

    @Override
    void accept(NodeVisitor visitor) {
        System.out.println("***********Visitor Pattern*******************");
        System.out.println(
                "Can change the operation being performed on courselist and facade without the need of changing the classes of the elements that you are operating on");
        System.out.println("Class Course List accept method");
        visitor.visitCourse(this);

    }

}
