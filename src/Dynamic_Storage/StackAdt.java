package Dynamic_Storage;

public class StackAdt {

    static Node top=new Node();

    public static void main(String[] args) {
        StackAdt s1=new StackAdt();
        s1.push(5);
        s1.push(7);
        s1.printStack();
    }

    private void printStack() {
        Node curr=top;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
    }

    private static void push(int data) {
        Node temp=new Node(data);
        temp.next=top;
        top=temp;
    }
}
