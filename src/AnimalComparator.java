import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal_HashSet> {

    @Override
    public int compare(Animal_HashSet o1, Animal_HashSet o2) {
        if (o1 == o2) {
            return 0; // объекты равны
        }
        if (o1 == null || o2 == null) {
            throw new IllegalArgumentException("Несовпадение типов при сравнении объектов");
        }

        Integer age1 = o1.getAge();
        Integer age2 = o2.getAge();
        return age1.compareTo(age2);

    }
}
