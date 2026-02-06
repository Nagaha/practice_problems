package Dynamic_Storage;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Node head=new Node(100);
        head=LinkedList.InsertEnd(head,200);
        head=LinkedList.InsertEnd(head,200);
        head=LinkedList.InsertEnd(head,300);
        head=LinkedList.InsertEnd(head,300);
        head=LinkedList.InsertEnd(head,300);
        LinkedList.PrintList(head);
        head=removeDuplicatesOf(head);
        System.out.println();
        LinkedList.PrintList(head);

    }

    private static Node removeDuplicatesOf(Node head) {
        Node curr=head;

        while(curr!=null && curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }
            else
             curr=curr.next;
        }
        return head;
    }
}
