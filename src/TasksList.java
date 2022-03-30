import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TasksList {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Сколько будет введено чисел?");
        int n = sc.nextInt();
        List<Integer> numberS = new ArrayList<>(n);
        while (n != 0) {
            n--;
            System.out.println("Введите число");
            int number = sc.nextInt();
            numberS.add(number);
        }

        System.out.println("1.Добавить элемент в список;\n2.Удалить элемент из списка;\n3.Показать содержимое списка;\n4.Проверить есть ли значение в списке;\n5.Заменить значение в списке");
        int x = sc.nextInt();
        if (x == 1) {
            System.out.println("Введите число");
            int number = sc.nextInt();
            numberS.add(number);
        } else if (x == 2){
            System.out.println("Какое число удалить?");
            int y = sc.nextInt();
            Iterator<Integer> iterator = numberS.iterator();
            while (iterator.hasNext()){

            }
            iterator.remove();
        }




    }
}
