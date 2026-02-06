package ZohoL2.src.LibraryMS;

import java.util.Date;

public class Transaction {
    int transactionId;
    String memberId;
    String bookId;
    int borrowDay=1;
    int dueDay=10;

    public Transaction() {
    }

    public Transaction(int transactionId, String memberId, String bookId) {
        this.transactionId = transactionId;
        this.memberId = memberId;
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", memberId='" + memberId + '\'' +
                ", bookId='" + bookId + '\'' +
                ", borrowDate=" + borrowDay +
                ", dueDate=" + dueDay +
                '}';
    }
}
