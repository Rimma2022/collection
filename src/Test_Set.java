import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test_Set {
    public static void main(String[] args) throws IOException {
        // HashSet в разброс, затирается
        HashSet<String> cities = new HashSet<>();
        cities.add("Minsk");
        cities.add("Brest");
        cities.add("Grodno");
        System.out.println(cities);
        cities.add("Minsk");
        System.out.println(cities);
        cities.add("Moscow");
        cities.add("Mosty");
        cities.add("Kiev");
        System.out.println(cities);
        HashSet<Animal_HashSet> animals = new HashSet<>();
        animals.add(new Animal_HashSet("Bob", 5, "black"));
        animals.add(new Animal_HashSet("Murzik", 3, "white"));
        System.out.println(animals);
        animals.add(new Animal_HashSet("Bob", 5, "black"));
        System.out.println(animals);

        animals.removeIf(animal_hashSet -> "Murzik".equals(animal_hashSet.getName()));
        System.out.println(animals);
        animals.add(new Animal_HashSet("Murzic", 3, "white"));
        System.out.println(animals);

        Animal_HashSet animal1 = new Animal_HashSet("Murzik", 30, "white");
        Animal_HashSet animal2 = new Animal_HashSet("Bob", 13, "black");
        TreeSet<Animal_HashSet> animalTreeSet = new TreeSet<>();
        animalTreeSet.add(animal1);
        animalTreeSet.add(animal2);
        System.out.println("Sotring..." + animalTreeSet);

//        TreeSet<Animal_HashSet> animalTreeSet2 = new TreeSet<>(new AnimalComparator()); второй способ

        // LinkedHashSet по порядку добавления, не затирается
        LinkedHashSet<String> citiesLinkedHashSet = new LinkedHashSet<>();
        citiesLinkedHashSet.add("Гродно");
        citiesLinkedHashSet.add("Минск");
        citiesLinkedHashSet.add("Брест");
        citiesLinkedHashSet.add("Гродно");
        System.out.println(citiesLinkedHashSet);

        //TreeSet отсортирован
        TreeSet<String> namesTreeset = new TreeSet<>();
        namesTreeset.add("Петя");
        namesTreeset.add("Катя");
        namesTreeset.add("Аня");
        namesTreeset.add("Миша");
        System.out.println(namesTreeset);

        ArrayList<Animal_HashSet> animalsLit = new ArrayList<>();
        animalsLit.sort(new AnimalComparator());



        HashSet<User> userNames = new HashSet<>();
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String userName = reader.readLine();
            String password = reader.readLine();

            if (userNames.add(new User(userName, password))) {
                System.out.println("Пользователь успешо добавлен");
            } else {
                System.out.println("Имя пользователя существует");
            }

        }















    }
}
