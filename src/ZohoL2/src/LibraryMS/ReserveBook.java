package ZohoL2.src.LibraryMS;

import java.util.ArrayList;

public class ReserveBook {
    String bookId;
    ArrayList<Member> members=new ArrayList<>();

    @Override
    public String toString() {
        return "ReserveBook{" +
                "bookId='" + bookId + '\'' +
                ", members=" + members +
                '}';
    }
}
