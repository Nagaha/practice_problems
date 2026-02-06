import java.util.Arrays;

public class FairPair {
    public static void main(String[] args) {
        int arr[]={0,1,4,4,5};
        int upper=6;
        int lower=3;        
        int pairs=countfairPairs(arr,lower,upper);
        System.out.println(pairs);
        
    }

    private static int countfairPairs(int[] arr, int lower, int upper) {
        int pairs=0;
        Arrays.sort(arr);
        int idx=0;
        int low_ptr=1;
        int high_ptr=arr.length;
        do{
            ++low_ptr;
        }while (arr[idx]+arr[low_ptr]<=lower);
        do{
            --high_ptr;
        }while (arr[idx]+arr[high_ptr]>=upper);

        while (idx< arr.length ){
            while (arr[idx]+arr[low_ptr]<lower){
                low_ptr++;
            }
            while (arr[idx]+arr[high_ptr]>upper){
                high_ptr--;
            }
            if(arr[idx]+arr[low_ptr]>=lower && arr[idx]+arr[high_ptr]<=upper){
                pairs+=high_ptr-low_ptr+1;
                idx++;
            }

        }
        System.out.println(low_ptr+" "+high_ptr);
        return pairs;
    }
}
