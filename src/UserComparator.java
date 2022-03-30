import java.util.Comparator;

public class UserComparator implements Comparator<User_1> {

    @Override
    public int compare(User_1 o1, User_1 o2) {
        return new Integer(o1.getAge()).compareTo(new Integer(o2.getAge()));
    }
}
