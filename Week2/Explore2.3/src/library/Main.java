package library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Aston Library");

        library.addBook(new Book(
            "Book 1",
            "Author 1",
            2000,
            true
        ));

        library.addBook(new Book(
            "Book 2",
            "Author 2",
            2005,
            false
        ));

        library.addBook(new Book(
            "Book 3",
            "Author 3",
            2015,
            true
        ));

        for (int i = 0; i < library.getBooks().size(); i++) {
            System.out.println(library.getBooks().get(i));
        }
    }
}
