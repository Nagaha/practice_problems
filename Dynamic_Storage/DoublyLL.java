package Dynamic_Storage;

class NodeD{
    int data;
    NodeD prev;
    NodeD next;

    public NodeD(int data) {
        this.data = data;
    }


}
public class DoublyLL {

    public static void main(String[] args) {
        NodeD head=new NodeD(56);
        head=insertBegin(head,100);
        head=insertBegin(head,106);
        head=insertBegin(head,109);
        head=insertEnd(head,59);
        head=insertEnd(head,60);
        head=insertPos(head,70,3);
        head=insertPos(head,76,5);
        printList(head);
        head=deleteBegin(head);
        head=deleteEnd(head);

        System.out.println();
        //head=reverseDL(head);
        printList(head);
    }

    private static NodeD deleteEnd(NodeD head) {
        if(head==null || head.next==null){
            return null;
        }
        NodeD curr=head;
        while(curr.next!=null){

            curr=curr.next;
        }
        curr.prev.next=null;
        return head;
    }

    private static NodeD deleteBegin(NodeD head) {
        if(head==null || head.next==null){
            return null;
        }
        NodeD curr=head;
        head=curr.next;
        curr.next.prev=null;

        return head;
    }

    private static NodeD reverseDL(NodeD head) {
        if(head==null || head.next==null){
            return head;
        }
        NodeD curr=head;
        NodeD Prev=null;
        NodeD Next=null;
        while(curr!=null){
            Next=curr.next;
            curr.next=Prev;
            curr.prev=Next;

            Prev=curr;
            curr=Next;
        }
        return Prev;
    }

    private static NodeD insertPos(NodeD head, int data, int pos) {
        NodeD temp=new NodeD(data);
        NodeD curr=head;
        for(int i=1;i<=pos-2;i++) {
            curr = curr.next;
        }
        temp.next=curr.next;
        temp.prev=curr;
        curr.next=temp;
        return head;
    }


    private static NodeD insertBegin(NodeD head,int data){
        NodeD temp=new NodeD(data);
        temp.next=head;
        if(head!=null)
            head.prev=temp;
        return temp;
    }

    private static NodeD insertEnd(NodeD head, int data) {
        NodeD temp=new NodeD(data);
        if(head==null){
            head=temp;
            return head;
        }
        NodeD curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev=curr;
        return head;


    }

    private static void printList(NodeD head) {
        NodeD curr=head;
        while(curr!=null){
            System.out.print(curr.data+"<->");
            curr=curr.next;
        }
    }
}
