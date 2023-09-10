import java.util.Objects;

public class Book {
    private String title;
    private int publicationYear;
    private Author author;

    Book(String title, int publicationYear, Author author) {
        this.publicationYear =publicationYear;
        this.author = author;
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publicationYear);
    }

    @Override
    public String toString() {
        return "Книга " + title + ", год издания " + publicationYear + ", автор " + author;
    }
}
