import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainUser_1 {
    public static void main(String[] args) {
        ArrayList<User_1> users = new ArrayList<>();
        users.add(new User_1("Minsk", 10, 5));
        users.add(new User_1("Grodno", 5, 100));
        users.add(new User_1("Brest", 40, 20));
        System.out.println(users);
        new Integer(10).compareTo(new Integer(30));
        User_1 user1 = new User_1("Minsk", 10, 30);
        User_1 user2 = new User_1("Minsk", 30, 1);
        if (user1.compareTo(user2) > 0) { //user1 < user2 = -1
            System.out.println("Рейтинг больше у пользователя" + user1.toString());
        }
        if (user1.rating > user2.rating) {
            System.out.println("Рейтинг больше у пользователя" + user1.toString());
        }
        Collections.sort(users);
        System.out.println(users);
        Collections.sort(users, new UserComparator());
        System.out.println(users);
    }
}
