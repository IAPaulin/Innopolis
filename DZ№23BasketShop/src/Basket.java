import java.util.List;

public interface Basket {

    void addProduct(String produkt, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String product);


}
