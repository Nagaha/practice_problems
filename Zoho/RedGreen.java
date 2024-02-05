package Zoho;

public class RedGreen {
    public static void main(String[] args) {
        int min_step=CountMinSteps("RGRGGRR");
        System.out.println(min_step);
    }

    public static int CountMinSteps(String str) {
        int R_count=0;
        int G_count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='R'){
                R_count++;
            }
            if(str.charAt(i)=='G'){
                G_count++;
            }
        }
        return Math.min(R_count,G_count);//It returns the minimum steps required
    }
}
// This program returns the minimum number of steps required to convert a string into same colors either RED or GREEN