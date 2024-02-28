package Zoho;
/*17.Given an array of integers, compute the maximum value for each integer in the index, by either summing all the digits or multiplying all the digits.
 (Choose which operation gives the maximum value)
Input:
•	5
•	120 24 71 10 59
•	Output:
•	3 8 8 1 45
Explanation: For index 0, the integer is 120.
Summing the digits will give 3, and whereas Multiplying the digits gives 0. Thus, maximum of this two is 3.*/
public class Z_D17 {
    public static void main(String[] args) {
        int ans[]=findMaxim(new int[]{120,24,71,10,59});
        for(int x:ans){
            System.out.print(x+" ");
        }
    }

    private static int[] findMaxim(int[] arr) {
       //The approach is naive we find the sum of the digiits and multiplication digits
        //This can be done by extracting the each digit fromm the number
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int sumTemp=0;
            int mulTemp=1;
            int num=arr[i];
            while(num>0){
                int x=num%10;
                sumTemp+=x;
                mulTemp*=x;
                num/=10;
            }
            System.out.println(sumTemp+ " "+mulTemp);//We check which is greater and add it to the corresponding array
            ans[i]=Math.max(sumTemp,mulTemp);
        }
        return ans;
    }
}
