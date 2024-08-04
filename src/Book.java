public class Book {
    private Author author;
    public Object getAuthor;
    private final String title;
    private int publishYear;

    public Book(Author author, String title, int publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
    }
    public String getTitle() {
        return title;
    }
    public int getPublishYear() {
        return publishYear;
    }
    public void setPublishYear(int publishYear) {
        if (publishYear < 1950 || publishYear > 2050) {
            System.out.println("Invalid publishing year:" + publishYear);
            return;
        }
        this.publishYear = publishYear;
    }
    public String getBook() {
        return this.author + " " + this.title + " " + this.publishYear;
    }
}
