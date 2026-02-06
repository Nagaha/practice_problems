package Stack_ADT;

import java.util.Arrays;

class Stack{
  int top=-1;
  int arr[];
  Stack(int size){
      arr=new int[size];
  }


    public void push(int data) {
      top++;
      arr[top]=data;
    }

    public void print() {
      for(int i=0;i<=this.top;i++){
          System.out.print(arr[i]+" ");
      }


    }

    public int pop() {
      int ans=arr[top];
      top--;
      return ans;
    }

    public int peek() {
      return arr[top];
    }

    public boolean isEmpty() {
      if(top==-1){
          return true;
      }
      return false;
    }

    public boolean isFull() {
      if(top==arr.length-1){
          return true;
      }
      return false;
    }

    public int search(int data) {
      for(int i=top;i>=0;i--){
          if(arr[i]==data){
              return i;
          }
      }
      return -1;
    }

    public int size() {
      return top+1;
    }
}
public class Stack_Imp {
    public static void main(String[] args) {

        Stack s1=new Stack(10);
        s1.push(100);
        s1.push(200);
        s1.push(300);
        s1.push(400);
        s1.push(500);
        s1.print();
        System.out.println();
        int x=s1.pop();
        System.out.println(x);
        int y=s1.peek();
        System.out.println(y);
        boolean is_Empty=s1.isEmpty();
        boolean is_Full=s1.isFull();
        int z=s1.search(100) ;
        int size=s1.size();
        s1.print();
    }

}
