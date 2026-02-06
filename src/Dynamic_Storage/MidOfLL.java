package Dynamic_Storage;

public class MidOfLL {
    public static void main(String[] args) {
        Node head=new Node(500);
        head=LinkedList.InsertEnd(head,200);
        head=LinkedList.InsertEnd(head,300);
        head=LinkedList.InsertEnd(head,400);
        head=LinkedList.InsertEnd(head,700);
        head=LinkedList.InsertEnd(head,900);
        head=LinkedList.InsertEnd(head,800);
        int ans=findMid(head);
        System.out.println(ans);
    }

    private static int findMid(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
}
