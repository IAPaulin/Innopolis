package ru.paulin;

public class Walle extends Robot {

    protected void say() {
        System.out.println("Евааа !");
    }

    protected void garbage(int gar) {
        if (gar == 0) {
            System.out.println("Все чисто");
        } else {
            System.out.println("Нужно убраться");
        }
    }

    @Override
    protected void diagnostics() {
        super.diagnostics();
        System.out.println("Валли очень добрый и любит Еву");
    }
}
