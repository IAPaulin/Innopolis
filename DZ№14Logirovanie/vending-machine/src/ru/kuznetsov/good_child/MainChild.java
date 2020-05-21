package ru.kuznetsov.good_child;

public class MainChild {

    public static void main(String[] args) throws Exception {

        System.setErr(System.out);
        mama();

    }

    private static void mama() throws Exception {
        int bludo = (int) (Math.random() * (4 - 1)) + 1;
        System.out.println(bludo);
        try {

            Child baby = new Child();
            System.out.println(baby.eat(bludo));
        } catch (Food1 ex) {
            System.out.println(ex.getMessage());

        } catch (RuntimeException ex) {
            System.out.println("Где моя еда ?");
        } finally {
            System.out.println("Спасибо Мама");
        }
    }
}
