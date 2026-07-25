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

    public abstract String getSummary();

    public abstract void displayBookDetails();
}
