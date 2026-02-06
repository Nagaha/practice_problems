public class GapSum {
    public static void main(String[] args) {
        printGapSum(new int[]{1,2,3,4,5,6,7,8,9},3);
    }

    private static void printGapSum(int[] arr, int gap) {
        for(int i=0;i<gap;i++){
            int sum=0;
            for(int j=i;j<arr.length;j+=gap){
                sum+=arr[j];
            }
            System.out.println(sum);
        }
    }
}
