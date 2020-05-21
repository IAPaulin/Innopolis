package Experiment;

public class Criminal implements Comparable<Criminal>{

    private String name;
    private short age;
    private int numberCrime;


    public Criminal(String name, short age, int numberCrime) {
        this.name = name;
        this.age = age;
        this.numberCrime = numberCrime;
    }

    public String getName() {
        return name;
    }

    public short getAge() {
        return age;
    }

    public int getNumberCrime() {
        return numberCrime;
    }

    @Override
    public String toString() {
        return "Experiment.Criminal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numberCrime=" + numberCrime +
                '}';
    }

    @Override
    public int compareTo(Criminal o) {

        int result =  this.name.compareTo(o.name);

        return result;
    }
}
