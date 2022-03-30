import java.util.Objects;

public class Animal_HashSet implements Comparable{
    private String name;
    private int age;
    private String color;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal_HashSet that = (Animal_HashSet) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(color, that.color);
    }



    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }

    @Override
    public String toString() {
        return "Animal_HashSet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public Animal_HashSet(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int compareTo(Object o) {
        if (this == (Animal_HashSet) o) {
            return 0; // объекты равны
        }
        if (o == null || getClass() != o.getClass()) {
            throw new IllegalArgumentException("Несовпадение типов при сравнении объектов");
        }

//        Animal_HashSet animal1 = this;
//        Animal_HashSet animal2 = (Animal_HashSet) o;
        Integer age1 = this.getAge();
        Integer age2 = ((Animal_HashSet) o).getAge();
        return age1.compareTo(age2);

//        if (animal1.getAge() < animal2.getAge()) {
//            return -1;
//        }
//        if (animal1.getAge() > animal2.getAge()) {
//            return 1;
//        }
//        return 0;

    }
}
