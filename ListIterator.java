import java.util.*;

public abstract class ListIterator {
    List<String> list;

    abstract Boolean hasNext();

    abstract String next();

    abstract String remove();

    abstract void moveToHead();
}
