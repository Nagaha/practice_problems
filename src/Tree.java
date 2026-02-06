class TNode{
    int data;
    TNode left;
    TNode right;

    public TNode(int data) {
        this.data = data;
    }

    public TNode() {
    }

    public TNode(int data, TNode left, TNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
public class Tree {
    public static void main(String[] args) {
          TNode root=new TNode(100);
          root.left=new TNode(200);
          root.right=new TNode(600);
          root=insertTree(400,root);
    }

    private static TNode insertTree(int data, TNode root) {
        TNode curr=root;
        return root;
    }
}
