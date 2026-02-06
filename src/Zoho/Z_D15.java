package Zoho;
/*15.Given an array of values persons[], each represents the weight of the persons. There will be infinite bikes available.
Given a value K which represents the maximum weight that a bike accommodates.
Along with that one more condition, a bike can carry two persons at a time.
You need to find out the least number of times, the bike trips are made.
 */
public class Z_D15 {
    public static void main(String[] args) {
        int arr[]=new int[]{10, 20, 30, 40, 50};
        int k=60;
        int trips=findTrips(arr,k);
        System.out.println("Minimum trips required: "+trips);
    }

    private static int findTrips(int[] arr, int weight) {
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        return sum/weight;
    }
}
