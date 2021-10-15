public class PersonFactory {
    public static Person createPersonInstance(String role, int courseLevel) {
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
