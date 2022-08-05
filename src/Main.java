public class Main {

    public static void main(String[] args) {
        Author stephenKing = new Author("Stephen", "King");
        Author ernestHemingway = new Author("Ernest", "Hemingway");

        Book christine = new Book("Christine", stephenKing, 1983);
        Book misery = new Book("Misery", stephenKing, 1987);
        Book islandsInTheStream = new Book("Islands In The Stream", ernestHemingway, 1900);

        islandsInTheStream.setPublishingYear(1970);

        Library library = new Library(5);

        library.addBook(christine);
        library.addBook(misery);
        library.addBook(islandsInTheStream);

        library.printLibrary();

        library.printInfoByTitle("Misery");
        if (library.changePulishingYear("Misery", 2000)) {
            library.printInfoByTitle("Misery");
        }
    }
}