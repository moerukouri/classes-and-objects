public class LibraryBook extends Book {

    public LibraryBook(String title, String author, int date){
        super(title, author, date);
    }

    @Override
    public String getSummary(int titleWidth, int authorWidth, int dateWidth) {
        String format = "%-" + titleWidth + "s | %-" + authorWidth + "s | %-" + dateWidth + "d%n";
        return String.format(format, title, author, date);
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + date);
    }
}
