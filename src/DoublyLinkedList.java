class NodeD{
    int data;
    NodeD prev;
    NodeD next;

    public NodeD(int data) {
        this.data=data;
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        NodeD a=new NodeD(10);
        NodeD b=new NodeD(20);
        NodeD c=new NodeD(30);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        
    }
}
