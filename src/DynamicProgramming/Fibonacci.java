package DynamicProgramming;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //memo function call
//        int dp[]=new int[11];
//        for(int i=0;i<dp.length;i++){
//            dp[i]=-1;
//        }
//         int ans=findFib(10,dp);
//        System.out.println(ans);

        //tabulation function call
        int num=sc.nextInt();
        int dp[]=new int[num+1];//we create a DP array of n+1 length

        //Step 1 compute the base cases and store
        dp[0]=0;
        dp[1]=1;

        //Step2 compute recursion relationship
        for(int i=2;i<=num;i++){
            dp[i]=dp[i-1]+dp[i-2];//computing them without recursion
        }

        //Step 3 pass to function and call
        int ans=findTab(num,dp);
        System.out.println(ans);
    }

    private static int findTab(int num, int[] dp) {
        return dp[num-1]+dp[num-2];
    }

    /**
     * MEMOZIATION (Top-down approach)
     * Here we use 1D array to store the computed sub problems
     * if we already computed the answer there is no reason in solving it again
     * So we check it first and compute
     * This approach decreases the time complexity*/
    private static int findFib(int n,int dp[]) {
       if(n<=1) return n;
       else if(dp[n]!=-1) return dp[n];//check if already computed
       else{
           dp[n]=findFib(n-1,dp)+findFib(n-2,dp);//compute if not present in array
           return dp[n];
       }
    }


}
