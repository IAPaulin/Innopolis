package ru.paulin.robot;

public enum Weather {

    GOOD(1), WIND(0.95), RAIN(0.75), FOG(0.6);

    private double hindrance;


    public double getHindrance() {
        return hindrance;
    }

    public void setHindrance(double hindrance) {
        this.hindrance = hindrance;
    }

    Weather(double hindrance) {

        this.hindrance = hindrance;
    }


}
