public class Main {
    public static void main(String[] args) {
        Inventory inventory = Inventory.getInstance();

        inventory.addProduct("Maçã", 50);
        inventory.addProduct("Banana", 30);

        inventory.removeProduct("Maçã", 10);
        inventory.removeProduct("Banana", 5);

        inventory.checkStock("Maçã");
        inventory.checkStock("Banana");
    }
}
