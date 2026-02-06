package MCA_Tasks;

import java.util.ArrayList;

public class Day8 {
    public static void main(String[] args) {
        int ans=eliminateFriends(5,6);
        System.out.println(ans);
    }

    private static int eliminateFriends(int n, int m) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        int pos=0;
        System.out.println(list.get(pos));
        while(list.size()>1){
            for(int i=1;i<=m;i++){
                if(pos==list.size()){
                    pos=0;
                }
                if(i==m){
                    System.out.println(list.get(pos));
                     if(pos==0) list.remove(pos-1);
                     if(pos!=0) list.remove(pos);
                    System.out.println(list.toString());
                }
                pos++;
            }
        }return 0;
    }
}
