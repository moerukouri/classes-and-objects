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
        int titleWidth = "Title".length();
        int authorWidth = "Author".length();
        int dateWidth = "Year".length();

        for (Book book : books) {
            titleWidth = Math.max(titleWidth, book.getTitle().length());
            authorWidth = Math.max(authorWidth, book.getAuthor().length());
            dateWidth = Math.max(dateWidth, String.valueOf(book.getDate()).length());
        }

        String headerFormat = "%-" + titleWidth + "s | %-" + authorWidth + "s | %-" + dateWidth + "s%n";
        System.out.printf(headerFormat, "Title", "Author", "Year");

        for (Book book : books) {
            System.out.println(book.getSummary(titleWidth, authorWidth, dateWidth));
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
