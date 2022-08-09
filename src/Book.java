import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private final String id;
    private int publishingYear;

    public Book(String title, Author author, int publishingYear) {
        this.title = title;
        this.author = author;
        id = getId();
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getId() {
        return title.toUpperCase() + author.getId();
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1950 || publishingYear > 2050) {
            System.out.println("Invalid publishingYear parameter: " + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }

    public String toString() {
        return "'" + getTitle() + "'" + " by " + getAuthor() + ", published in " + getPublishingYear();
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b2 = (Book) other;
        return id.equals(b2.id);
    }

    public int hashCode() {
        return Objects.hash(id);
    }
}
