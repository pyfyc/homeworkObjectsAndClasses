public class Main {

    // Authors
    public static Author stephenKing = new Author("Stephen", "King");
    public static Author stephenKing2 = new Author("Stephen", "King");
    public static Author ernestHemingway = new Author("Ernest", "Hemingway");

    // Books
    public static Book christine = new Book("Christine", stephenKing, 1983);
    public static Book christine2 = new Book("Christine", stephenKing, 1983);
    public static Book misery = new Book("Misery", stephenKing, 1987);
    public static Book islandsInTheStream = new Book("Islands In The Stream", ernestHemingway, 1900);

    // Library
    public static Library library = new Library(5);

    // Homework for 1.9. Objects and classes
    public static void Task1() {
        islandsInTheStream.setPublishingYear(1970);

        library.addBook(christine);
        library.addBook(misery);
        library.addBook(islandsInTheStream);

        library.printLibrary();

        library.printInfoByTitle("Misery");
        if (library.changePulishingYear("Misery", 2000)) {
            library.printInfoByTitle("Misery");
        }
    }

    // Homework for 1.10. Object's methods
    public static void Task2() {
        System.out.println(stephenKing);
        System.out.println(christine);
        System.out.println(stephenKing.getId());
        System.out.println(stephenKing.equals(stephenKing2));
        System.out.println(christine.getId());
        System.out.println(christine.equals(christine2));
        System.out.println(stephenKing.hashCode() == stephenKing2.hashCode());
        System.out.println(christine.hashCode() == christine2.hashCode());
    }

    public static void main(String[] args) {
        //Task1();
        Task2();
    }
}