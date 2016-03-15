package IO;

/**
 * Created by Cheater-PC on 14.03.2016.
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "namae='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
