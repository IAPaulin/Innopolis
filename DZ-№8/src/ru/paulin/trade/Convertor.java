package ru.paulin.trade;

public class Convertor {

    public static Act convertor(Contract cont) {
        Act ac1 = new Act();

        ac1.setNumberContract(cont.getNumberContract());
        ac1.setData(cont.getData());
        ac1.setProduct(cont.getProduct());

        return ac1;
    }
}
