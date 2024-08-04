import java.util.Objects;

public class Book {
    private final Author author;
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

    public String toString() {
        return "Название автора: " + this.author.toString() + ". Название книги: " + this.title + ". Год публикации: " + this.publishYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }
}
