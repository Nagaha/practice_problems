package Zoho_3rd_round;
import java.util.*;
public class Palindrome {
      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
        public static boolean isPalindrome(ListNode head) {
            Stack<Integer> stack=new Stack<>();
            ListNode curr=head;
            while(curr !=null){
                stack.push(curr.val);
                System.out.println(stack.peek());
                curr=curr.next;
            }
            curr=head;
            while(!stack.isEmpty()){
                if(stack.pop()==curr.val){
                    curr=curr.next;
                }
                else{
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode one = new ListNode(2);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(1);
        head.next = one;
        one.next = two;
        two.next = three;
        System.out.println(isPalindrome(head));
    }
}
