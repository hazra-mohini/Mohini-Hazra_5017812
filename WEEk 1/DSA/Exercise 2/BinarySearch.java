// package ECommerceSearch;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {

    public static Product binarySearch(Product[] products, int productId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].getProductId() == productId) {
                return products[mid];
            } else if (products[mid].getProductId() < productId) {
                low = mid + 1;
            } else {
                high = mid - 1;
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

        // Sort products by productId for binary search
        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));

        int searchId = 3;
        Product foundProduct = binarySearch(products, searchId);
        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct);
        } else {
            System.out.println("Product not found with ID: " + searchId);
        }
    }
}
