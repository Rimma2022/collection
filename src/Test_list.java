import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Test_list {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(100);//10
        names.add("Паша");
        names.add("Маша");
        names.add("Иван");

        ((ArrayList<String>) names).trimToSize();


        for (String name : names) {
            System.out.println(name);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
//        names.remove("Маша");
        boolean result = names.remove("Маша");
        if (result) {
            System.out.println("Объкт удален");
        } else {
            System.out.println("Объект не удален");
        }

        String userName =  "Маша";
        System.out.println(names.contains(userName));
        System.out.println(names.get(0));
        System.out.println();

        //коллекция чисел
        List<Integer> numbers = Arrays.asList(1, 2, 5, 100, 3);
        numbers.set(1, 20);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            int n = iterator.next();
            if(n % 2 == 0) {
                iterator.remove();
            }
            System.out.println();
        }
        System.out.println(numbers);
        numbers.removeIf(x -> x % 2 == 0);

//        for (int number: numbers) {
//            if(number % 2 == 0) {
//                numbers.remove(number);
//            }
//        }
//        System.out.println(numbers); неверный способ выше

        numbers.forEach(x -> {
            System.out.println(x*2);
            //другие действия
        });



    }
}
