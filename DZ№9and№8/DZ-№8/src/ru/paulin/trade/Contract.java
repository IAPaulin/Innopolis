package ru.paulin.trade;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Contract {

    private int numberContract;
    private LocalDate data;
    private int numberProduct;
    private String[] product;

    public void setNumber(int number) {
        this.numberProduct = number;
        product = new String[number];
        loadingProduct();
    }


    public void setNumberContract(int numberContract) {

        this.numberContract = numberContract;
    }

    public void setData(LocalDate data) {

        this.data = data;
    }

    public long getNumberContract() {
        return numberContract;
    }

    public LocalDate getData() {
        return data;
    }

    public String[] getProduct() {
        return product;
    }


    public void loadingProduct() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < product.length; i++) {
            System.out.println("Введите наименование  товара");
            product[i] = scan.nextLine();
        }


    }

    @Override
    public String toString() {
        System.out.println("toString вызывается");
        return "Contract{" +
                "numberContract=" + numberContract +
                ", data=" + data +
                ", numberProduct=" + numberProduct +
                ", product=" + Arrays.toString(product) +
                '}';

    }
}
