package ZohoL2.src.saro_intervie_prep;

public class Array1 {
    public static void main(String[] args) {
        int[] nums = new int[] {5,7,9,8,0};
        String[] ans = printOddEven(nums);
        summarizeResults(nums, ans);
        System.out.println(ans);
        System.out.println(nums);
    }
    private static void summarizeResults(int v1[], String v2[]){
        for(int i=0;i<v1.length;i++){
            System.out.println(v1[i] + "-->" + v2[i]);
        }
    }
    private static String[] printOddEven(int arr[]){
        String result[] = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                result[i] = "even";
            }
            else{
                result[i] = "odd";
            }
        }
        return result;
    }
}
