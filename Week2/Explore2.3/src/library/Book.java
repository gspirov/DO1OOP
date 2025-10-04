package library;

public class Book {
    private final String title;
    private final String author;
    private final int yearPublished;
    private final boolean onLoan;

    public Book(String title, String author, int yearPublished, boolean onLoan) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.onLoan = onLoan;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                ", onLoan=" + onLoan +
                '}';
    }
}
