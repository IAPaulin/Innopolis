import ru.kuznetsov.VendingMachine;
import ru.kuznetsov.VendingMachineForTea;

public class Main {

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        vm.addMoney(100);
        vm.giveMeADrink(2);

        VendingMachineForTea vmft = new VendingMachineForTea();
        vmft.addMoney(150);
        vmft.giveMeADrink(1);
    }
}
