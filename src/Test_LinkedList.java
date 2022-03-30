import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test_LinkedList {
    public static void main(String[] args) throws IOException {
        List<String> names = new LinkedList<>();
        LinkedList<String> n2 = new LinkedList<>();
        names.add("Иван");
        names.add("Катерина");
        names.add("Петр");
        names.add(0, "Ольга");
        System.out.println(names);
        System.out.println(names.indexOf("Катерина"));
        System.out.println(names.get(1));
        String[] mass = {"Михаил", null, "Борис"};
        names.addAll(Arrays.asList(mass));
        n2.addFirst("Татьяна");
        n2.addLast("Петр");
        n2.add("Катя");

        /**
         * 0. Создать коллекцию из 3 номеров телефонов. Реализовать функцию вставки в коллекцию одновременно 3 новых телефона.
         * 1.Создать коллекцию из 5 номеров телефонов. Реализовать функцию поиска телефона по индексу
         */
        //0
        LinkedList<String> n3 = new LinkedList<>();
        n3.add("+375291581407");
        n3.add("+375293527101");
        n3.add("+375333900489");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите номер для добавления");
        String a = r.readLine();
        System.out.println("Введите номер для добавления");
        String b = r.readLine();
        System.out.println("Введите номер для добавления");
        String c = r.readLine();
        LinkedList<String> n4 = new LinkedList<>();
        n4.add(a);
        n4.add(b);
        n4.add(c);
        n3.addAll(n4);
        System.out.println(n3);
        // Циклом быстрее
//        System.out.println("Введите 3 номера для добавления");
//        for (int i = 0; i < 3; i++) {
//            n4.add(r.readLine());
//        }
        n3.addAll(n4);

        n3.removeIf(x -> x.equals("+375333900489"));
        System.out.println(n3);
        //1
        List<String> n5 = new ArrayList<>();
        n5.add("+375291581407");
        n5.add("+375293527101");
        n5.add("+375333900489");
        n5.add("+375333900488");
        n5.add("+375333900493");
        System.out.println("По какому индексу искать номер?");
        String  f = r.readLine();
        Integer number;
        try {
            number = Integer.parseInt(f);
            System.out.println(n5.get(number));
        } catch (NumberFormatException e) {
            System.out.println("Введена строка");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Несуществующий индекс");
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка");
        }
//        System.out.println(n5.get(Integer.parseInt(f)));

    }
}

