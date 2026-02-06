package ZohoL2.src.LibraryMS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library {
    static int revenue=0;//maintains the profit of the library
    static int transactionId=0;//maintains the transaction id
    Scanner sc=new Scanner(System.in);
    ArrayList<ReserveBook> reserveBookList=new ArrayList<>();//maintains the list of books to be reserved
    HashMap<String,Book> listOfBooks=new HashMap<>();//maintains list of books in library
    HashMap<String,Member> memberList=new HashMap<>();//maintains the member list
    ArrayList<Transaction> transactions=new ArrayList<>();//logs all the transaction
    ArrayList<Transaction> overDueList=new ArrayList<>();//maintains the transaction with overdue


    public void populateData() {
        //Adding books to library
        Book b1=new Book("RamsayLives","B1",2,2,"Rahul");
        Book b2=new Book("IndianGirl","B2",2,2,"Sujatha");
        Book b3=new Book("BhatSingh","B3",2,2,"Jha");
        Book b4=new Book("Jindabad","B4",2,2,"Kalki");
        
        listOfBooks.put(b1.bookId,b1);
        listOfBooks.put(b2.bookId,b2);
        listOfBooks.put(b3.bookId,b3);
        listOfBooks.put(b4.bookId,b4);
        
        //Adding members to library
        Member m1=new Member("Mathi","M1",0,0,0);
        Member m2=new Member("Ram","M2",0,0,0);
        Member m3=new Member("Raj","M3",0,0,0);
        Member m4=new Member("Ravi","M4",0,0,0);
        
        memberList.put(m1.memberId,m1);
        memberList.put(m2.memberId,m2);
        memberList.put(m3.memberId,m3);
        memberList.put(m4.memberId,m4);

    }

    public void addBook() {
        System.out.println("Enter the book name: ");
        String bookName=sc.next();
        System.out.println("Enter the author name: ");
        String authorName=sc.next();
        System.out.println("Enter the number of copies: ");
        int noOfCopies=sc.nextInt();

        String bookId='B'+String.valueOf(listOfBooks.size()+1);//generating id
        Book newBook=new Book(bookName,bookId,noOfCopies,noOfCopies,authorName);//creating a book
        listOfBooks.put(newBook.bookId, newBook);//adding to book list
        System.out.println("New Book added successFully");
        System.out.println(newBook.toString());
    }

    public void addMember() {
        System.out.println("Enter the member name: ");
        String memberName=sc.next();

        String memBerId='M'+String.valueOf(memberList.size()+1);//generating id
        Member newMember=new Member(memberName,memBerId,0,0,0);//creating new member
        memberList.put(newMember.memberId,newMember);//adding to member list
        System.out.println("New Member added successFully");
        System.out.println(newMember.toString());
    }

    public void removeBook() {
        System.out.println("Enter the book id to be removed: ");
        String bookId=sc.next();
        //check if the book is reserved or borrowed


        if(listOfBooks.containsKey(bookId)){//check if book is present
            //check if the book is reserved or borrowed
            for(Member temp:memberList.values()){//traversing all the users to check someone have the book
                for(Book b:temp.currentBookList){
                    if(b.bookId==bookId){
                        System.out.println("The book is being borrowed by"+temp.memberId);
                    }
                }
            }
            Book currbook=listOfBooks.get(bookId);
            System.out.println("Removed book");
            System.out.println(currbook.toString());
            listOfBooks.remove(bookId);//remove book
            System.out.println("_________________________");
            System.out.println("the remaining books are");
            //printing remaining books
            for(Map.Entry<String,Book> book:listOfBooks.entrySet()){
                System.out.println(book.getValue().toString());
            }

//            System.out.println("Book removed successfully");
        }
        else {
            System.out.println("Book id not exists");
        }
    }

    public void removeMember() {
        System.out.println("Enter the member id: ");
        String memberId=sc.next();
        Member currentMember=new Member();

        //check member is available and he has no books to return
        if(memberList.containsKey(memberId) && (memberList.get(memberId).currentBookList.size())==0){
//            memberList.remove(memberId);
            currentMember=memberList.get(memberId);
            System.out.println(currentMember.toString());
            memberList.remove(memberId);
            System.out.println("Member removed successfully");
        }
        //if he has books to return display them
        else if(memberList.containsKey(memberId) && (memberList.get(memberId).currentBookList.size())!=0){
            System.out.println("Return the books which are borrowed");
            currentMember=memberList.get(memberId);
            for(Book book:currentMember.currentBookList){
                System.out.println(book.bookName);
            }
        }
        else{//if member is not present
            System.out.println("Member id does not exists");
        }
    }

    public void searchBook() {
        System.out.println("Enter the book name: ");
        String bookName=sc.next();
        Book currBook=null;
        for(Map.Entry<String,Book> bookEntry:listOfBooks.entrySet()){

            //check book name is present
            if(bookEntry.getValue().bookName.equals(bookName)){
                currBook=bookEntry.getValue();
                System.out.println("Book found!");
                System.out.println(currBook.copiesAvailable+
                        " is available for book named "+currBook.bookName+
                        " and book id"+currBook.bookId);

                //get his choice of borrowing
                System.out.println("Do you want borrow book(y/n):");
                String ch=sc.next();
                if(ch.equals("y") && currBook.copiesAvailable>0){
                   borrowBook(currBook);
                }
                else if(ch.equals("y") && currBook.copiesAvailable<=0){
                    reserveBook(currBook);
                }
                break;
            }
        }
        if(currBook==null) System.out.println("No book found");
    }

    private void reserveBook(Book currBook) {
        System.out.println("No copies are available do you want to reserve the book:(y/n) ");
        String reserve=sc.next();
        if(reserve.equals("y")){
            ReserveBook newReserveBook=new ReserveBook();//creating a new reserve book
            newReserveBook.bookId= currBook.bookId;
            ArrayList<Member> currHoldingList=new ArrayList<>();//creating a list to maintain the members with current book
            for(Map.Entry<String,Member> member:memberList.entrySet()){
                if(member.getValue().currentBookList.contains(currBook) && !currHoldingList.contains(member.getValue())){
                    currHoldingList.add(member.getValue());//adding the members
                }
            }
            newReserveBook.members=currHoldingList;

            //adding the book to the reserve list
            reserveBookList.add(newReserveBook);
            System.out.println("Book reserved successfully");

        }

    }

    public void generateReports() {
        System.out.println("Report of books in library");
        for(Map.Entry<String,Book> book:listOfBooks.entrySet()){
            System.out.println(book.getValue().toString());
        }
        System.out.println("_______________________________________________________");

        System.out.println("Report of members of library");
        for(Map.Entry<String,Member> member:memberList.entrySet()){
            System.out.println(member.getValue().toString());
        }
        System.out.println("_______________________________________________________");

        System.out.println("Reserve book list");
        for(ReserveBook reserveBook:reserveBookList){
            System.out.println(reserveBook.bookId);
            for(Member member: reserveBook.members){
                System.out.println(member.toString());
            }
        }
        System.out.println("_______________________________________________________");

        printBorrowBooks();
        System.out.println("---------------------------------------------------------");
        System.out.println("History of borrowed");
        for(Map.Entry<String,Member> member:memberList.entrySet()){
            for(Book book:member.getValue().borrowedList){
                System.out.println(book.bookName+" "+member.getValue().memberId);
            }
            System.out.println("********");
        }
    }


    public void borrowBook(Book currBook){
        System.out.println("Enter your member id: ");
        String memberId=sc.next();
        if(memberList.containsKey(memberId)){
            Member currMember=memberList.get(memberId);

            //if he wants one book again after his limit
            if(currMember.currentBookList.size()>=2){
                if(currMember.currentBookList.size()==2){//if he can borrow one book on extra pay
                    System.out.println("You can a borrow a book by paying 1 rupee for each day: ");
                    System.out.println("Do you want to borrow (y/n): ");
                    String borrow=sc.next();
                    if(borrow.equals("y")){
                        currMember.currentBookList.add(currBook);
                        currMember.borrowedList.add(currBook);
                        currMember.noOfBooksBorrowed+=1;
                        currMember.noOfBooksToReturn+=1;
                        currBook.copiesAvailable-=1;
                        //log the transaction
                        Transaction newTransaction=new Transaction();
                        newTransaction=new Transaction(transactionId,memberId, currBook.bookId);
                        transactionId++;//incrementing the id for next transaction
                        System.out.println("Due days is 10");
                        transactions.add(newTransaction);
                        System.out.println("Book borrowed successfully");
                    }
                }
                else{
                    System.out.println("You reached your limit");
                }

                //handle for extra book


            }
            //to continue
            else{
                currMember.currentBookList.add(currBook);
                currMember.borrowedList.add(currBook);
                currMember.noOfBooksBorrowed+=1;
                currMember.noOfBooksToReturn+=1;
                Transaction newTransaction=new Transaction();
                newTransaction=new Transaction(transactionId,memberId, currBook.bookId);
                transactionId++;//incrementing the id for next transaction
                System.out.println("Due days is 10");
                System.out.println("Book borrowed successfully");
                transactions.add(newTransaction);
                currBook.copiesAvailable-=1;
            }

        }
        else{
            System.out.println("The member id not exists");
            borrowBook(currBook);
        }
    }
    public void returnBook() {
        System.out.println("Enter your memberId:");
        String memberId=sc.next();
        if(!memberList.containsKey(memberId)){
            System.out.println("Invalid member id");
            returnBook();
        }
        else{
            Member currMember=memberList.get(memberId);
            if(currMember.currentBookList.size()==0){
                System.out.println("No books to return");
            }
            else{
                for(Book book:currMember.currentBookList){
                    System.out.println(book.bookName+" "+book.bookId);
                }

                    System.out.println("Enter the book id to return: ");
                    String currBookId = sc.next();
                    if(!listOfBooks.containsKey(currBookId)){
                        System.out.println("No book exists");
                    }
                    Book currBook = listOfBooks.get(currBookId);
                    currBook.copiesAvailable += 1;
                    System.out.println("Enter the days from borrow: ");
                    int days = sc.nextInt();
                    if (days > 10) {
                        System.out.println("You have to pay " + (days - 10));
                        revenue += (days - 10);
                    }
                    System.out.println("Book returned");
                    currMember.currentBookList.remove(currBook);


            }
        }
//        System.out.println(transactions);
    }

    public void printBorrowBooks() {
        System.out.println("Borrowed book list");
        for(Map.Entry<String,Member> member:memberList.entrySet()){
            System.out.println(member.getValue().memberId);
            if(member.getValue().currentBookList.size()==0){
                System.out.println("No books borrowed");
            }
            else{
                for(Book book:member.getValue().currentBookList){
                    System.out.println(book.bookName);
                }
            }

        }
    }

    public void printRevenue() {
        System.out.println("The total revenue is: "+revenue);
    }
}
