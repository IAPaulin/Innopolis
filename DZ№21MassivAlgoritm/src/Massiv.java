public class Massiv {

    /**
     * Функция принимает массив и сдвигает все элементы на одну
     * позицию, последний элемент зануляется
     * @param mas
     */
    public void shiftMas(int[][] mas) {

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (j == mas.length - 1) {
                    mas[i][mas.length - 1] = 0;
                } else {
                    mas[i][j] = mas[i][j + 1];
                }
            }
        }
    }

    /**
     * Функция принимает массив, инициализирует его
     * случайными значениями и возвращает его
     * @param mas
     * @return
     */
    public int[][] initialMas(int[][] mas) {


        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = (int) (Math.random() * 100);
            }
        }
        return mas;
    }

    /**
     * функция принимает массив и выводит его в
     * консоль
     * @param m
     */
    public void showMas(int m[][]) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * функция принимает массив и переставляет элементы в
     * обратном порядке
     * @param mas
     */
    public void reversMas(int[][] mas) {

        int border = mas.length / 2;
        int buffer;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < border; j++) {
                buffer = mas[i][j];
                mas[i][j] = mas[i][mas.length - (1 + j)];
                mas[i][mas.length - (1 + j)] = buffer;
            }
        }

    }
}
