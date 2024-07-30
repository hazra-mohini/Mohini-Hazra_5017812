package LibraryManagementSystem;

import java.util.List;

public class BinarySearch {

    public static Book binarySearchByTitle(List<Book> books, String title) {
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Book midBook = books.get(mid);
            int comparison = midBook.getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return midBook;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book(1, "The Gitanjali", "Rabindranath Tagore"),
                new Book(2, "Pother Panchali", "Bibhutibhuson Bandopadhay"),
                new Book(3, "Kabuliwala", "Rabindranath Tagore"));

        // Ensure the list is sorted by title
        books.sort((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        String titleToSearch = "1984";
        Book foundBook = binarySearchByTitle(books, titleToSearch);

        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}
