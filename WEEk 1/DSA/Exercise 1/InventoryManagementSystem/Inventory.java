package InventoryManagementSystem;
import java.util.HashMap;

public class Inventory {
    private HashMap<Integer, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(int productId, int quantity, double price) {
        Product product = products.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
        }
    }

    public void deleteProduct(int productId) {
        products.remove(productId);
    }

    public Product getProduct(int productId) {
        return products.get(productId);
    }

    public void displayProducts() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Adding products
        inventory.addProduct(new Product(1, "Laptop", 10, 1200.50));
        inventory.addProduct(new Product(2, "Smartphone", 20, 800.99));
        inventory.addProduct(new Product(3, "Tablet", 15, 300.00));

        // Display products
        System.out.println("Products in inventory:");
        inventory.displayProducts();

        // Update product
        inventory.updateProduct(2, 25, 750.00);
        System.out.println("\nAfter updating product 2:");
        inventory.displayProducts();

        // Delete product
        inventory.deleteProduct(1);
        System.out.println("\nAfter deleting product 1:");
        inventory.displayProducts();
    }
}
