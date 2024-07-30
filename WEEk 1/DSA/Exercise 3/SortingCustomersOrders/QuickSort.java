package SortingCustomersOrders;

public class QuickSort {
    public class OrderSorter {

        public static void quickSort(Order[] orders, int low, int high) {
            if (low < high) {
                int pi = partition(orders, low, high);

                quickSort(orders, low, pi - 1);
                quickSort(orders, pi + 1, high);
            }
        }

        private static int partition(Order[] orders, int low, int high) {
            double pivot = orders[high].getTotalPrice();
            int i = (low - 1);
            for (int j = low; j < high; j++) {
                if (orders[j].getTotalPrice() < pivot) {
                    i++;

                    Order temp = orders[i];
                    orders[i] = orders[j];
                    orders[j] = temp;
                }
            }

            Order temp = orders[i + 1];
            orders[i + 1] = orders[high];
            orders[high] = temp;

            return i + 1;
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

            quickSort(orders, 0, orders.length - 1);

            System.out.println("\nOrders after Quick Sort:");
            for (Order order : orders) {
                System.out.println(order);
            }
        }
    }

}
