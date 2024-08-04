public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Max", "Frei");
        Author author2 = new Author("Joe", "Abercrombie");
        Author author3 = new Author("Joe", "Abercrombie");

        Book book1 = new Book(author1, "Foreigner", 1996);
        Book book2 = new Book(author2, "A little Hatred", 2009);
        book2.setPublishYear(2019);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println("Один и тот же автор: " + author1.equals(author2));
        System.out.println("Один и тот же автор: " + author2.equals(author3));
    }
}

