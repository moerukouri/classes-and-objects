public class Book {
    protected String title;
    protected String author;
    protected int date;

    public Book(String title, String author, int date){
        this.title = title;
        this.author = author;
        this.date = date;
    }

    public String getTitle(){ return title; }
    public String getAuthor(){ return author; }
    public int getDate(){ return date; }

    public String getSummary(int titleWidth, int authorWidth, int dateWidth){
        String format = "%-" + titleWidth + "s | %-" + authorWidth + "s | %-" + dateWidth + "d";
        return String.format(format, title, author, date);
    }

    public void displayBookDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + date);
    }
}
