public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Max", "Frei");
        Author author2 = new Author("Joe", "Abercrombie");

        Book book1 = new Book(author1, "Foreigner", 1996);
        Book book2 = new Book(author2, "A little Hatred", 2009);
        book2.setPublishYear(2019);
        System.out.println("Автор " + author1.getAuthor() + " Название " + book1.getTitle() + " Год публикации " + book1.getPublishYear());
        System.out.println("Автор " + author2.getAuthor() + " Название " + book2.getTitle() + " Год публикации " + book2.getPublishYear());

    }
}

