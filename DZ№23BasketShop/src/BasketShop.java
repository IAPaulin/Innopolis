import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasketShop implements Basket {


    List<Product> basketProducts = new ArrayList<>();


    @Override
    public void addProduct(String produkt, int quantity) {


        if (basketProducts.isEmpty()) {
            Product pr = new Product();
            pr.setName(produkt);
            pr.setQuantity(quantity);
            basketProducts.add(pr);
            System.out.println("продукт добавлен");
        } else {
            boolean bool = true;
            String name;

            for (Product prd : basketProducts) {
                name = prd.getName();
                if (name.equals(produkt)) {
                    prd.setQuantity(prd.getQuantity() + quantity);
                    bool = false;
                    break;
                } else {
                    bool = true;
                }
            }

            if (bool) {
                Product pr = new Product();
                pr.setName(produkt);
                pr.setQuantity(quantity);
                basketProducts.add(pr);
                System.out.println("продукт добавлен");
            } else {
                System.out.println("добавлено дополнительное колличество продукта");
            }
        }
    }

    @Override
    public void removeProduct(String product) {

        String name;

        Product pr;
        Iterator<Product> iter = basketProducts.iterator();

        while (iter.hasNext()) {
            pr = iter.next();
            name = pr.getName();
            if (name.equals(product)) {
                iter.remove();

            }

        }

       /* for (Product pr : basketProducts) {
            name = pr.getName();
            if (name.equals(product)) {
                basketProducts.remove(pr);

            }
        }*/
        System.out.println("Продукт удален");
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {

        String name;
        int counter = 0;

        for (Product pr : basketProducts) {
            name = pr.getName();
            if (name.equals(product)) {
                pr.setQuantity(quantity);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("такого продукта нет");
        }

    }

    @Override
    public void clear() {

        basketProducts.clear();

    }

    @Override
    public List<String> getProducts() {

        List<String> nameProduct = new ArrayList<>();

        for (Product pr : basketProducts) {
            nameProduct.add(pr.getName());
        }


        return nameProduct;
    }

    @Override
    public int getProductQuantity(String product) {

        int quantity = 0;
        String name;

        for (Product pr : basketProducts) {
            name = pr.getName();
            if (name.equals(product)) {
                quantity = pr.getQuantity();
            }
        }

        return quantity;
    }


}
