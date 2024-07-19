/*1110. Delete Nodes And Return Forest
Given the root of a binary tree, each node in the tree has a distinct value.
After deleting all nodes with a value in to_delete, we are left with a forest (a disjoint union of trees).
Return the roots of the trees in the remaining forest. You may return the result in any order.
Example 1:
Input: root = [1,2,3,4,5,6,7], to_delete = [3,5]
Output: [[1,2,null,4],[6],[7]]
Example 2:

Input: root = [1,2,4,null,3], to_delete = [3]
Output: [[1,2,4]]*/
class Solution {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> rem=new ArrayList<>();
        Set<Integer> del=new HashSet<>();
        for(int x:to_delete){
            del.add(x);
        }

        //Recursive function
        removeNodes(root,del,rem);
        if(!del.contains(root.val)){
            rem.add(root);
        }
        return rem;
    }
    public TreeNode removeNodes(TreeNode root,Set<Integer> del,List<TreeNode> rem){
        if(root==null){
            return null;
        }
        root.left=removeNodes(root.left,del,rem);
        root.right=removeNodes(root.right,del,rem);
        if(del.contains(root.val)){
            if(root.left!=null){
                rem.add(root.left);
            }
            if(root.right!=null){
                rem.add(root.right);
            }
           return null;
        }
         return root;
    }
}
