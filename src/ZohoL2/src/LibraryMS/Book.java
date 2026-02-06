package ZohoL2.src.LibraryMS;

public class Book {
    String bookName;
    String bookId;
    int noOfCopies;
    int copiesAvailable;

    String authorName;

    public Book(String bookName, String bookId, int noOfCopies, int copiesAvailable, String authorName) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.noOfCopies = noOfCopies;
        this.copiesAvailable = copiesAvailable;
        this.authorName = authorName;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookId='" + bookId + '\'' +
                ", noOfCopies=" + noOfCopies +
                ", copiesAvailable=" + copiesAvailable +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
