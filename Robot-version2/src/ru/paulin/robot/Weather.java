package ru.paulin.robot;

public enum Weather {

    GOOD(0),WIND(10),RAIN(20), FOG(40);

    public float hindrance;

    Weather(float hindrance) {
        this.hindrance = hindrance;
    }
}
