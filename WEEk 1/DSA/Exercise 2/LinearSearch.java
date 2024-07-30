// package ECommerceSearch;

public class LinearSearch {

    public static Product linearSearch(Product[] products, int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Shoes", "Fashion"),
                new Product(3, "Watch", "Accessories"),
                new Product(4, "Phone", "Electronics")
        };

        int searchId = 3;
        Product foundProduct = linearSearch(products, searchId);
        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct);
        } else {
            System.out.println("Product not found with ID: " + searchId);
        }
    }
}
