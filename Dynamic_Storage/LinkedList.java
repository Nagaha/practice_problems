package Dynamic_Storage;

class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}
public class LinkedList {
    public static Node InsertBeginning(Node head,int data ){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        return head;
    }
    public static void PrintList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
    }
    public static Node InsertEnd(Node head, int data) {
        if(head==null){
            head.data=data;
            return head;
        }
        Node curr=head;
        Node temp=new Node(data);
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }
    public static Node InsertPos(Node head, int pos, int data) {
        if(pos ==0||pos==1){
            head=InsertBeginning(head,data);
            return head;
        }
        Node temp=new Node(data);
        Node curr=head;
        for (int i=1;i<=pos-2;i++){
            curr=curr.next;
            if(curr==null){
                return null ;
            }
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
    public static Node DeleteBeginning(Node head) {
        if(head==null){
            return null;
        }
        head=head.next;
        return head;
    }
    public static Node DeleteEnd(Node head) {
        if(head==null || head.next==null){
            return null;
        }
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }
    public static Node DeletePos(Node head, int pos) {
        if(head==null){
            return null;
        }
        Node curr=head;
        for(int i=1;i<=pos-2 && curr!=null;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
    public static int SearchLL(Node head,int data) {
        Node curr=head;
        int count=1;
        while(curr!=null){
            if(curr.data==data){
                return count;
            }
            count++;
            curr=curr.next;
        }
        return -1;
    }
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node Next=null;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=Next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head=InsertBeginning(head,20);
        head=InsertBeginning(head,30);
        head=InsertBeginning(head,40);
        head=InsertEnd(head,78);
        head=InsertEnd(head,98);
        head=InsertPos(head,3,100);
        head=InsertPos(head,7,1000);
        head=DeleteBeginning(head);
        head=DeleteEnd(head);
        head=DeletePos(head,4);
        int x=SearchLL(head,1000);
        PrintList(head);
        System.out.println();
        //System.out.println(x);
        head=reverse(head);
        PrintList(head);
    }




}
