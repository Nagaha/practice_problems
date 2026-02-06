package ZohoL2.src.LibraryMS;

import java.util.ArrayList;

public class Member {
    String memberName;
    String memberId;
    int noOfBooksBorrowed;
    int noOfBooksToReturn;
    int overDueFee;
    ArrayList<Book> borrowedList=new ArrayList<>();
    ArrayList<Book> currentBookList=new ArrayList<>();

    public Member() {
    }

    public Member(String memberName, String memberId, int noOfBooksBorrowed, int noOfBooksToReturn, int overDueFee) {
        this.memberName = memberName;
        this.memberId = memberId;
        this.noOfBooksBorrowed = noOfBooksBorrowed;
        this.noOfBooksToReturn = noOfBooksToReturn;
        this.overDueFee = overDueFee;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberName='" + memberName + '\'' +
                ", memberId='" + memberId + '\'' +
                ", noOfBooksBorrowed=" + noOfBooksBorrowed +
                ", noOfBooksToReturn=" + noOfBooksToReturn +
                ", overDueFee=" + overDueFee +
                '}';
    }
}
