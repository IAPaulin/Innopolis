import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Massiv massiv = new Massiv();

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размерность массива");

        int size = scan.nextInt();
        int massTest[][] = new int[size][size];


        massTest = massiv.initialMas(massTest);

        System.out.println("Исходный массив");
        massiv.showMas(massTest);
        System.out.println();

        massiv.shiftMas(massTest);

        System.out.println("Полученный массив со здвигом");
        massiv.showMas(massTest);
        System.out.println();


        massiv.reversMas(massTest);

        System.out.println("Реверс массива");
        massiv.showMas(massTest);
        System.out.println();
    }
}
