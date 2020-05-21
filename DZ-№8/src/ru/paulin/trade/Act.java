package ru.paulin.trade;

import java.time.LocalDate;
import java.util.Arrays;

public class Act {

    private long numberContract;
    private LocalDate data;
    private String[] product;

    public long getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(long numberContract) {
        this.numberContract = numberContract;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String[] getProduct() {
        for (int i = 0; i < product.length; i++) {
            System.out.println(product[i]);
        }
        return product;
    }

    public void setProduct(String[] product) {
        this.product = product;
    }

    @Override
    public String toString() {
        System.out.println("toString вызывается");
        return "Act{" +
                "numberContract=" + numberContract +
                ", data=" + data +
                ", product=" + Arrays.toString(product) +
                '}';
    }
}
