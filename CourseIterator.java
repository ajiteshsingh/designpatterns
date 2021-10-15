import java.util.*;

public class CourseIterator extends ListIterator {
    List<String> list;
    int pos = 0;

    CourseIterator(List<String> list) {
        System.out.println("***************Iterator Pattern*****************");
        System.out.println("Iterating over the course list to display the course choice");
        this.list = list;
    }

    @Override
    Boolean hasNext() {
        if (pos < list.size()) {
            return true;
        }
        return false;
    }

    @Override
    String next() {
        String element = list.get(pos);
        pos++;
        return element;
    }

    @Override
    String remove() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    void moveToHead() {
        // TODO Auto-generated method stub

    }

}
