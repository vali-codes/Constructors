//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Auto benz1 = new Auto("Mercedes", "C63", 20404);
        Auto benz2 = new Auto("BMW", "M5", 2016);
        Auto benz3 = new Auto("Audi", "RS6", 2022);
        benz1.printdetails();
        benz2.printdetails();
        benz3.printdetails();
    }
}