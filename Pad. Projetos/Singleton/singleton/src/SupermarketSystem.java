public class SupermarketSystem {
    private Inventory inventory;

    public SupermarketSystem() {
        this.inventory = Inventory.getInstance();
    }

    public void addProductsToInventory(String productName, int quantity) {
        inventory.addProduct(productName, quantity);
    }

    public void removeProductsFromInventory(String productName, int quantity) {
        inventory.removeProduct(productName, quantity);
    }

    public void displayStock(String productName) {
        int stock = inventory.checkStock(productName);
        System.out.println("Estoque de " + productName + ": " + stock);
    }
}
