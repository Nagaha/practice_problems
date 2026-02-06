package Stack_ADT;
class LStack{
    int data;
    LStack next;

    LStack head;
    int size=0;


    public void push(int data) {
        LStack temp=new LStack();
        temp.data=data;
        temp.next=head;
        head=temp;
        size++;
    }

    public void print() {
        LStack curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
    }

    public int pop() {
        int ans=head.data;
        head=head.next;
        size--;
        return ans;
    }

    public int peek() {
        return head.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if(head==null){
            return true;
        }
        return false;
    }
}
public class Linked_Imp {
    public static void main(String[] args) {
         LStack s1=new LStack();
         s1.push(100);
         s1.push(200);
         s1.push(300);
         s1.push(400);
        System.out.println(s1.peek());
        System.out.println(s1.size());
        s1.print();
        System.out.println();
        System.out.println(s1.pop());
        System.out.println(s1.peek());
        System.out.println(s1.size());
        System.out.println(s1.isEmpty());
    }
}
