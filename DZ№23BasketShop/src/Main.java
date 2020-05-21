import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        BasketShop basket = new BasketShop();

        System.out.println("Введите exit что бы завершить работу");
        System.out.println("Введите add что бы добавить продукт");
        System.out.println("Введите rem что бы удалить продукт");
        System.out.println("Введите up что бы изменить колличество продукта");
        System.out.println("Введите cl что бы отчистить корзину");
        System.out.println("Введите gp что бы получить список продуктов в корзине");
        System.out.println("Введите gq что бы получить колличество продукта в корзине");


        String answer = scan.nextLine();
        int number;

        while (!(answer.equals("exit"))) {

            switch (answer) {
                case "add":
                    System.out.println("Введите название продукта");
                    answer = scan.nextLine();
                    System.out.println("Введите количество товара который хотите добаваить");
                    number = scan.nextInt();
                    basket.addProduct(answer, number);
                    scan.nextLine();
                    break;

                case "rem":
                    System.out.println("Введите название продукта");
                    answer = scan.nextLine();
                    basket.removeProduct(answer);
                    break;

                case "up":
                    System.out.println("Введите название продукта");
                    answer = scan.nextLine();
                    System.out.println("Введите количество данного товара");
                    number = scan.nextInt();
                    basket.updateProductQuantity(answer, number);
                    scan.nextLine();
                    break;

                case "cl":
                    basket.clear();
                    break;

                case "gp":
                    System.out.println(basket.getProducts());
                    break;

                case "gq":
                    System.out.println("Введите название продукта");
                    answer = scan.nextLine();
                    System.out.println(basket.getProductQuantity(answer));
                    break;

                default:
                    System.out.println("такой команды нет");


            }

            System.out.println("Введите команду");
            answer = scan.nextLine();


        }
        basket.basketProducts.add(new Product("ttt",4));
        basket.basketProducts.add(new Product("fff",5));
        basket.basketProducts.add(new Product("tor",44));
        basket.basketProducts.add(new Product("cat",9));
        System.out.println(basket.basketProducts.get(2));

    }
}
