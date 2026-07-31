import java.util.*;

public class Library {
    private final List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public boolean addBook(Book book){
        for(Book exisitng : books){
            if(exisitng.getTitle().equalsIgnoreCase(book.getTitle()) && exisitng.getAuthor().equalsIgnoreCase(book.getAuthor())){
                System.out.println("Book already exists!");
                return false;
            }
        }
        books.add(book);
        System.out.println("Book added Successfully!");
        return true;
    }

    public void displayAll() {
        System.out.println("Book List: ");
        printBooks(books);
        }

    public void searchBook(String searchTitle) {
        List<Book> matches = new ArrayList<>();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(searchTitle)) {
                matches.add(book);
            }
        }

        if (matches.isEmpty()) {
            System.out.println("Book not found!");
            return;
        }

        System.out.println("Book found!");
        printBooks(matches);
    }

    public void printBooks(List<Book> books) {
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
}
