import jdk.nashorn.internal.ir.annotations.Immutable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test_Map {
//    public static TreeSet<Integer> myQueue = new TreeSet<>();
//    public static TreeSet<User> myQ = new TreeSet<>();
    public static HashMap<String, List<String>> translator = new HashMap<>(); //хранит словарь
    public static HashMap<String, Integer> statistic = new HashMap<>();
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
//        myQueue.add(5);
//        myQueue.add(1);
//        myQueue.add(10);
//        myQueue.add(7);
//        System.out.println(myQueue);
//        HashMap<String, Integer> testMap = new HashMap<>();
//        testMap.put("user1", 111);
//        testMap.put("user2", 222);
//        testMap.put("user1", 333);
//        System.out.println(testMap.size());
//        System.out.println(testMap.get("user1"));
//        String name = "user3";
//        if (!testMap.containsKey(name)) {
//            testMap.put(name, 444);
//        }
//        Set<String> blokedSet = new HashSet<>();
//        blokedSet.add("user2");
//        blokedSet.add("user3");
//
//        Set<Map.Entry<String, Integer>> entrySet = testMap.entrySet();
//        for (Map.Entry<String, Integer> entry : testMap.entrySet()){
//            if (blokedSet.contains(entry.getKey())) {
//                testMap.remove(entry.getKey());
//            }
//            entry.getValue();
//        }
//        testMap.values();
//        System.out.println(testMap.size());

        // Задание 2
        //Создать программу по работе со словарем. Например,
        //англо-испанский или французско-немецкий, или любое
        //другое направление.
        //Программа должна:
        //■ Обеспечивать начальный ввод данных для словаря.
        //■ Позволять отобразить слово и его переводы.
        //■ Позволять добавить, заменить, удалить переводы слова.
        //■ Позволять добавить, заменить, удалить слово.
        //■ Отображать топ-10 самых популярных слов (определяем популярность на основании счетчика обращений).
        //■ Отображать топ-10 самых непопулярных слов (определяем непопу
//        HashMap<String, String> dictionary = new HashMap<>();
//        dictionary.put("family", "семья");
//        dictionary.put("husband", "муж");
//        dictionary.put("wife", "жена");
//        dictionary.put("daughter", "дочь");
//        dictionary.put("son", "сын");
//        do {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            String x = reader.readLine();
//            Integer X = Integer.parseInt(x);
//            System.out.println("0. Выход;\n1. Отоброзить слово и его перевод");
//
//        } while (X != 0);
        init();
        int choise = showMenu();
        switch (choise) {
            case 1: rusToEngl(); break;
            case 3: remove(); break;
        }
    }

    private static void remove() throws IOException {
        System.out.println("ВВедите слово (англ):");
        String userWord = reader.readLine();
        if (translator.containsKey(userWord.toLowerCase())) {
            System.out.println(userWord + " - " + translator.get(userWord.toLowerCase()));
            System.out.println("Нажмите 1 для удаления всей коллекции\n2 - введите порядковый номер элемента для удаления");
            int userChoise = Integer.parseInt(reader.readLine());
            switch (userChoise) {
                case 1 : translator.remove(userWord.toLowerCase()); break;
                case 2:
                    int deleteIndex = Integer.parseInt(reader.readLine());
                    List<String> list = translator.get(userWord.toLowerCase());
                    int index = 0;
                    Iterator<String> each = list.iterator();
                    boolean removed = false;
                    while (each.hasNext()) {
                        if (index == deleteIndex) {
                            each.remove();
                            removed = true;
                        }
                        index++;
                    }
                    if (removed) {
                        System.out.println("Удален!!!");
                    }
            }


        } else {
            System.out.println("Извините, слово не найдено...");
        }
    }

    private static void rusToEngl() throws IOException {
        System.out.println("ВВедите слово (англ):");
        String userWord = reader.readLine();
        if (translator.containsKey(userWord.toLowerCase())) {
            System.out.println(userWord + " - " + translator.get(userWord.toLowerCase()));
            int count = statistic.get(userWord.toLowerCase());
            statistic.put(userWord.toLowerCase(), ++count);
        } else {
            System.out.println("Извините, перевод не найден...");
        }
    }

    private static int showMenu() throws IOException {

        System.out.println("Выберети операцию: \n1 - перевод англ - русский" +
                "\n2 - изменить слово\n3 - удалить \n4 - заменить");
        return Integer.parseInt(reader.readLine());

    }

    private static void init() {
        ArrayList<String> hello = new ArrayList<>();
        hello.addAll(Arrays.asList("привет", "добрый день", "здравствуйте"));
        translator.put("hello", hello);
        statistic.put("hello", 0);
        ArrayList<String> bye = new ArrayList<>();
        bye.addAll(Arrays.asList("пока", "до встречи"));
        translator.put("bye", bye);
        statistic.put("bye", 0);
        ArrayList<String> ok = new ArrayList<>();
        ok.addAll(Arrays.asList("хорошо", "ладно", "ok"));
        translator.put("ok", ok);
        statistic.put("ok", 0);
    }




}
