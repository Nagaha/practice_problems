package Zoho;

public class Divisible_3 {
    public static int IfDivisible(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]%3;
        }
        if(sum%3==0){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
//        int ans= IfDivisible(new int[]{40,50,90});
//        System.out.println(ans);

        String s1="Hello";
        System.out.println(s1.hashCode());
        s1=s1+"world";
        System.out.println(s1.hashCode());

    }
}
/*This program is to find whether the digits in the array may be divided by 3 or not*/
