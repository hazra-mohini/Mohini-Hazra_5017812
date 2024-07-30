package LibraryManagementSystem;

import java.util.List;

public class LinearSearch {

    // Linear search to find a book by title
    public static Book linearSearchByTitle(List<Book> books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book(1, "The Gitanjali", "Rabindranath Tagore"),
                new Book(2, "Pother Panchali", "Bibhutibhuson Bandopadhay"),
                new Book(3, "Kabuliwala", "Rabindranath Tagore"));

        String titleToSearch = "1984";
        Book foundBook = linearSearchByTitle(books, titleToSearch);

        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}
