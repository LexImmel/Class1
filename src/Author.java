public final class Author {
    private final String name;
    private final String surname;
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getAuthor() {
        return name+ " "+surname;
    }

}
