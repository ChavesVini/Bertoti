import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private static Inventory instance;
    private Map<String, Integer> products;

    private Inventory() {
        products = new HashMap<>();
    }

    public static synchronized Inventory getInstance() {
        if (instance == null) {
            instance = new Inventory();
        }
        return instance;
    }

    public void addProduct(String productName, int quantity) {
        products.put(productName, products.getOrDefault(productName, 0) + quantity);
        System.out.println("Adicionado " + quantity + " de " + productName);
    }

    public boolean removeProduct(String productName, int quantity) {
        int currentQuantity = products.getOrDefault(productName, 0);
        if (currentQuantity >= quantity) {
            products.put(productName, currentQuantity - quantity);
            System.out.println("Removido " + quantity + " de " + productName);
            return true;
        } else {
            System.out.println("Estoque insuficiente para " + productName);
            return false;
        }
    }

    public void checkStock(String productName) {
        Integer stock = products.getOrDefault(productName, 0);
        System.out.println("Estoque de " + productName + ": " + stock);
    }
}
