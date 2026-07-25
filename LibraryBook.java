public class LibraryBook extends Book {

    public LibraryBook(String title, String author, int date){
        super(title, author, date);
    }

    @Override
    public String getSummary() {
        return String.format("%-30s | %-22s | %-10d", title, author, date);
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + date);
    }
}
