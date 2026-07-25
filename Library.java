import java.util.*;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added Successfully!");
    }

    public void displayBooks() {
        System.out.println("Book List: ");
        System.out.printf("%-30s | %-22s | %-10s%n", "Title", "Author", "Year");
        for (Book book : books) {
            System.out.println(book.getSummary());
        }
    }

    public void searchBook(String searchTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(searchTitle)) {
                System.out.println("Book found!");
                book.displayBookDetails();
                return;
            }
        }
        System.out.println("Book not found!");
    }
}
