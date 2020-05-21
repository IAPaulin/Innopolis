import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private String name;
    private String lastName;
    private LocalDate birthday;

    private static int counter=0;


    public Person() {
        counter++;
    }

    public Person(String name, String lastName, LocalDate birthday) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        counter++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(birthday, person.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, birthday);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public static int getCounter() {
        return counter;
    }
}
