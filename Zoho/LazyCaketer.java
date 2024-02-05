package Zoho;

public class LazyCaketer {
    public static void main(String[] args) {
        int cuts=CutCake(5);
        System.out.println(cuts);

    }

    public static int CutCake(int pieces) {
        int ans=(2+pieces+(pieces*pieces))/2;
        return ans;
    }
}
