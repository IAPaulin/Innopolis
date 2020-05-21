package ru.kuznetsov.exception;

public class BrokenMoneyException extends Exception {

    private static double zamitMony = 0;

    public BrokenMoneyException(String message, Double money) {
        super(message);
        this.zamitMony += money;
    }

    public static double getZamitMony() {
        return zamitMony;
    }

    public static void setZamitMony(double zamitMony) {
        BrokenMoneyException.zamitMony = zamitMony;
    }
}
