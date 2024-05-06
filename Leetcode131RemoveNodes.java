// 2487. Remove Nodes From Linked List
// You are given the head of a linked list.
// Remove every node which has a node with a greater value anywhere to the right side of it.
// Return the head of the modified linked list.

// Example 1:

// Input: head = [5,2,13,3,8]
// Output: [13,8]
// Explanation: The nodes that should be removed are 5, 2 and 3.
// - Node 13 is to the right of node 5.
// - Node 13 is to the right of node 2.
// - Node 8 is to the right of node 3.
// Example 2:

// Input: head = [1,1,1,1]
// Output: [1,1,1,1]
// Explanation: Every node has value 1, so no nodes are removed.
class Solution {
    public ListNode removeNodes(ListNode head) {
        //My approach is simple 
      Stack<ListNode> stack=new Stack<>();//Creating a stack to put nodes
      ListNode curr=head;//pointer to traverse the nodes
      while(curr!=null){
        if(stack.isEmpty()){//For the first Element iniially
            stack.push(curr);
        }
        else{
            while(!stack.isEmpty() && stack.peek().val<curr.val){
                //Take the top node value and check with current 
                //if current is larger then pop the top value
                //Do untill the condition is met or stack is empty
                stack.pop();
            }
            stack.push(curr);//if smaller push the current
        }
        curr=curr.next;//Moving to next node
      }
//Now the stack is done we are going to create the linked list
      curr=stack.pop();//resuing the curr 
      while(!stack.isEmpty()){
        stack.peek().next=curr;//Reversing the stack for creating LL
        curr=stack.pop();
      }

      return curr;//returning the head
    }
}
