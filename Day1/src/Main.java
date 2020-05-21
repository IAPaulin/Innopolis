import java.time.LocalDate;
import  static demo.Calculaor.*;
import demo.Calculaor;

public class Main {

    public static void main(String[] args) {


        Person ivan = new Person("Иван","Алексеев", LocalDate.of(1992,2,2));
        Person ivan2 = new Person("Иванy","Алексеев", LocalDate.of(1992,2,2));
        Person fat =new Person();

        System.out.println(ivan);
        System.out.println(ivan2);

        System.out.println(ivan2.hashCode());
        System.out.println(ivan.hashCode());

        System.out.println(ivan.equals(ivan2));

        Demo car =new Demo(2,100,"лада");
        Demo car1 = new  Demo(1,50,"Toyta");

        System.out.println(car);
        System.out.println(car1);

        System.out.println(car.equals(car1));

        //До объявления методов статичными static
        Calculaor calc =new Calculaor();

        System.out.println(calc.sub(100,40));
        System.out.println(calc.dev(9,4));

        //теперь метод static
        int a;
        a=Calculaor.sum(4,5);
        System.out.println(a);
        System.out.println(Calculaor.multi(4,6));

        //сделали импорт
        System.out.println(dev(8,2));

        System.out.println(Person.getCounter());




    }
}


























































