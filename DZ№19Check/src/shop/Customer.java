package shop;

import org.apache.log4j.Logger;
import shop.Cashier;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Customer {

    private   final Logger LOG = Logger.getLogger(Cashier.class.getName());


    private Product basket[] = new Product[2];


    public Product[] buyProduct() {

        LOG.info("Начало заполнения корзины");


        try (FileReader fr = new FileReader("products.txt");
             BufferedReader br = new BufferedReader(fr)
        ) {

            for (int i = 0; i < basket.length; i++) {
                if (br.ready()) {
                    if (i == (basket.length -1)) {
                        expansionBasket();
                    }
                    LOG.info("Куплен товар");
                    Product product = new Product();
                    basket[i] = product;
                    basket[i].setName(br.readLine());
                    basket[i].setNumber(Float.parseFloat(br.readLine()));
                    basket[i].setCost(Float.parseFloat(br.readLine()));


                } else {
                    break;
                }
            }
            return basket;

        } catch (FileNotFoundException e) {
            LOG.error("Корзина пуста");
            return null;
        } catch (IOException e) {
            LOG.error("Что-то работает не так");
            return null;
        }

    }

    private void expansionBasket() {

        Product newbasket[] = new Product[basket.length * 2];

        System.arraycopy(basket, 0, newbasket, 0, basket.length);
        LOG.info("Расширение корзины");

        basket = newbasket;
    }


}
