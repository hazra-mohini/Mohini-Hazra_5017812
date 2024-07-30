package SortingCustomersOrders;

public class BubbleSort {

    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {

                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Order[] orders = {
                new Order(1, "Alice", 300.50),
                new Order(2, "Bob", 150.75),
                new Order(3, "Charlie", 450.00),
                new Order(4, "David", 200.00)
        };

        System.out.println("Orders before sorting:");
        for (Order order : orders) {
            System.out.println(order);
        }

        bubbleSort(orders);

        System.out.println("\nOrders after Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
