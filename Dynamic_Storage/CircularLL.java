package Dynamic_Storage;
class NodeC{
    int data;
    NodeC next;
    NodeC(int data){
        this.data=data;
    }
}
public class CircularLL {
    public static void main(String[] args) {
        NodeC head=null;
        head=insertBegin(head,200);
        head=insertBegin(head,300);
        head=insertBegin(head,400);
        head=insertBeginO(head,700);
        head=insertBeginO(head,800);
        head=insertEnd(head,500);
        head=insertEnd(head,600);
        head=insertEndO(head,900);
        head=insertEndO(head,1000);
        printList(head);
        System.out.println();
//        head=deleteBegin(head);
        head=deleteBeginO(head);
//        head=deleteKth(head,5);
        printList(head);
    }

    private static NodeC deleteKth(NodeC head, int pos) {
        if(pos==1){
            return deleteBeginO(head);
        }
        else{
            NodeC curr=head;
            for(int i=1;i<=pos-2;i++){
                curr=curr.next;
            }
            curr.next=curr.next.next;
            return head;
        }
    }

    private static NodeC deleteBeginO(NodeC head) {
        //This is a optimised method which simply changes values in head and heads next node and forgets the heads next node
        //Now the data in first node got deleted
        NodeC Next=head.next;
        head.data=Next.data;
        head.next=Next.next;
        return head;
    }

    private static NodeC deleteBegin(NodeC head) {
        NodeC curr=head;
        while(curr.next!=head){
            curr=curr.next;
        }
        curr.next=head.next;
        head=head.next;
        return head;
    }

    private static NodeC insertEndO(NodeC head, int data) {
        NodeC temp=new NodeC(data);
        if(head==null){
            temp.next=temp;
            return temp;
        }
        temp.next=head.next;
        head.next=temp;
        int x=temp.data;
        temp.data=head.data;
        head.data=x;
        return temp;
    }

    private static NodeC insertBeginO(NodeC head, int data) {
        //efficient solution for insertion
        //here we put the new temp node in the head's next place and swap the values in the head and temp
        //this is O(1) TC
        NodeC temp=new NodeC(data);
        if(head==null){
            temp.next=temp;
            return temp;
        }
        temp.next=head.next;
        head.next=temp;
        int x=temp.data;
        temp.data=head.data;
        head.data=x;
        return head;
    }

    private static NodeC insertEnd(NodeC head, int data) {
        NodeC temp=new NodeC(data);
        if(head==null){
            temp.next=temp;
            return temp;
        }
        else{
            NodeC curr=head;
            while(curr.next!=head){
                curr=curr.next;
            }
            temp.next=head;
            curr.next=temp;
            return head;
        }
    }

    private static NodeC insertBegin(NodeC head, int data) {
        NodeC temp=new NodeC(data);
        if(head==null){
            temp.next=temp;
        }
        else{
            NodeC curr=head;
            while(curr.next!=head){
                curr=curr.next;
            }
            curr.next=temp;
            temp.next=head;
        }
        return temp;
    }
    private static void printList(NodeC head){
        NodeC curr=head;
       do{
           System.out.print(curr.data+"->");
           curr=curr.next;
       }while(curr!=head);
    }
}
