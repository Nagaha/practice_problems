package Dynamic_Storage;

public class NthNodeFromEnd {
    public static void main(String[] args) {
        Node head=new Node(300);
        head=LinkedList.InsertEnd(head,400);
        head=LinkedList.InsertEnd(head,500);
        head=LinkedList.InsertEnd(head,600);
        head=LinkedList.InsertEnd(head,700);
        head=LinkedList.InsertEnd(head,800);
        LinkedList.PrintList(head);
        System.out.println();
        int ans=fromEndO(head,3);
    }

    private static int fromEnd(Node head, int pos) {
        //This approach is not linear TC and give time complexity of NxM where N is the number of nodes and M is the position from the end
        Node curr=head;
        while(curr!=null){
            Node curr2=curr;
            for(int i=1;i<=pos && curr2.next!=null;i++){
                curr2=curr2.next;
            }
            if(curr2.next==null){
                return curr.data;
            }
            curr=curr.next;
        }
      return -1;
    }
    private static int fromEndO(Node head,int pos){
        //This method very optimised because it takes linear time complexity
        Node first=head;
        Node second=head;
        for(int i=1;i<=pos-1;i++){
            first=first.next;
        }
        while(first.next!=null){
            first=first.next;
            second=second.next;
        }
        return second.data;
    }
}
