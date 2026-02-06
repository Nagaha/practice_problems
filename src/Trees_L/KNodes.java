package Trees_L;

public class KNodes {
    public static void main(String[] args) {
        TNode root=new TNode(10);
        root.left=new TNode(20);
        root.right=new TNode(30);
        root.left.left=new TNode(40);
        root.left.right=new TNode(50);
        root.right.left=new TNode(70);
        printKNodes(root,2,0,0);
    }

    private static void printKNodes(TNode root, int N,int l,int r) {
        if(l==N || r==N){
            System.out.print(root.data+" ");
           
        }
        else{
            printKNodes(root.left,N,l++,r);
            printKNodes(root.right,N,l,r++);
        }
    }
}
