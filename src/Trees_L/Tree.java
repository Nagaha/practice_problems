package Trees_L;

class TNode{
    int data;
    TNode left;
    TNode right;
    TNode(int data){
        this.data=data;
    }
}
public class Tree {
    public static void main(String[] args) {
        TNode root=new TNode(100);
        root.left=new TNode(200);
        root.right=new TNode(300);
        root.left.left=new TNode(400);
        root.left.right=new TNode(500);
        root.right.left=new TNode(600);
        root.right.right=new TNode(700);


        preOrderTraversal(root);
        System.out.println();
        inOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);

    }

    private static void postOrderTraversal(TNode curr) {
        if(curr==null){
            return;
        }
        postOrderTraversal(curr.left);
        postOrderTraversal(curr.right);
        System.out.print(curr.data+"\t");
    }

    private static void inOrderTraversal(TNode curr) {
        if(curr==null){
            return;
        }
        inOrderTraversal(curr.left);
        System.out.print(curr.data+" ");
        inOrderTraversal(curr.right);
    }

    private static void preOrderTraversal(TNode curr) {
        if(curr==null){
            return;
        }
        System.out.print(curr.data+" ");
        preOrderTraversal(curr.left);
        preOrderTraversal(curr.right);
    }


}
