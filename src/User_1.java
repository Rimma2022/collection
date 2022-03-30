public class User_1  implements Comparable{
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String city;

    public User_1(String city, int age, int rating) {
        this.city = city;
        this.age = age;
        this.rating = rating;
    }

    public int age;
    public int rating;

    // (Grodno, 10).compareTo((Minsk", 50)) == 0         < 0    >0
    @Override
    public int compareTo(Object o) { // 0
        User_1 user1 = (User_1) o;
        User_1 user0 = this;

        return new Integer(user0.rating).compareTo(user1.rating);
    }

    @Override
    public String toString() {
        return "User_1{" +
                "city='" + city + '\'' +
                ", age=" + age +
                ", rating=" + rating +
                '}';
    }
}
