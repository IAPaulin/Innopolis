package DZ;

public class Person {

    private String name;
    private short age;

    public Person(String name, short age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public short getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "DZ.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
