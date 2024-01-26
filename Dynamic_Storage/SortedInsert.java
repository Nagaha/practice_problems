package Dynamic_Storage;

public class SortedInsert {
    public static void main(String[] args) {
        Node head=new Node(100);
        head=LinkedList.InsertEnd(head,200);
        head=LinkedList.InsertEnd(head,400);
        head=LinkedList.InsertEnd(head,500);
        head=sortInsertO(head,300);
        head=sortInsert(head,80);
        LinkedList.PrintList(head);
    }

    private static Node sortInsert(Node head, int data) {
        //If LL is empty return the node and if the first element is itself larger than the entry data handle the case
        Node temp=new Node(data);
        Node curr=head;
        if(curr==null){
            return temp;
        }
        if(curr.data>=data){
            temp.next=head;
            return temp;
        }
        //We have a prev Node to keep in track of the
        Node prev=curr;
        while(curr!=null && curr.data<=data){
            prev=curr;
            curr=curr.next;
        }
        temp.next=prev.next;
        prev.next=temp;
        return head;
    }
    private static Node sortInsertO(Node head,int data){

        Node temp=new Node(data);
        Node curr=head;
        if(curr==null){
            return temp;
        }
        if(curr.data>=data){
            temp.next=head;
            return temp;
        }
        //In this method we dirctly check the current node's next's data is greater or smaller
        // so we don't want a prev Node and can reduce space complexity
        while(curr!=null && curr.next.data<=data){
            curr=curr.next;
        }
        temp.next=curr.next;
       curr.next=temp;
        return head;
    }
}
