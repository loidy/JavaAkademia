package sk.akademia.persons;

public class Person {
    private String name;
    private int age;
    private float height;
    private float weight;
    private boolean sex;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, float height, float weight, boolean sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
