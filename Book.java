public abstract class Book {
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

    public abstract String getSummary(int titleWidth, int authorWidth, int dateWidth);

    public abstract void displayBookDetails();
}
