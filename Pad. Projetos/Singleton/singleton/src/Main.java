public class Main {
    public static void main(String[] args) {
        SupermarketSystem system = new SupermarketSystem();

        system.addProductsToInventory("Maçã", 50);
        system.addProductsToInventory("Banana", 30);

        system.removeProductsFromInventory("Maçã", 10);
        system.removeProductsFromInventory("Banana", 5);

        system.displayStock("Maçã");
        system.displayStock("Banana");
    }
}