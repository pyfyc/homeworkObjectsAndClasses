import java.util.Arrays;

public class Library {
    private Book[] library;

    public Library(int length) {
        library = new Book[length];
    }

    public void addBook(Book book) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] == null) {
                library[i] = book;
                return;
            }
        }
    }

    public void printLibrary() {
        for (int i = 0; i < library.length; i++) {
            if (library[i] != null) {
                System.out.println(library[i].getAuthor().toString() + ": " +
                        library[i].getTitle() + ": " +
                        library[i].getPublishingYear());
            }
        }
    }

    private Book getBookByTitle(String title) {
        Book book = null;
        for (int i = 0; i < library.length; i++) {
            if (library[i] != null) {
                if (library[i].getTitle() == title) {
                    book = library[i];
                }
            }
        }
        return book;
    }

    public void printInfoByTitle(String title) {
        Book book;
        book = getBookByTitle(title);
        if (book != null) {
            System.out.println(book.getTitle() + " by " + book.getAuthor().toString() +
                    " was published in " + book.getPublishingYear());
        }
    }

    public boolean changePulishingYear(String title, int newYear) {
        Book book;
        book = getBookByTitle(title);
        if (book != null) {
            book.setPublishingYear(newYear);
            return true;
        } else {
            return false;
        }
    }
}
