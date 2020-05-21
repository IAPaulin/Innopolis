package ru.paulin.car;

public class Car {

    private int vin;
    private static   int counter;



    public Car() {
        counter++;
        this.vin = setVin();
    }

    public static int getCounter() {
        return counter;
    }

    private int setVin(){
        return vin = hashCode();
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin=" + vin +
                '}';
    }
}
