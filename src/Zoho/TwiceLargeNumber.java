package Zoho;

public class TwiceLargeNumber {
    public static void main(String[] args) {
        int arr[] = {1, 6, 3, 2};
        int idx = getLargestTwice(arr);
        System.out.println(idx);
    }

    private static int getLargestTwice(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxIdx = 0;
        int secondMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                maxIdx = i;
                secondMax = max;
                max = arr[i];
            } else if (max > arr[i] && secondMax < arr[i]) {
                secondMax = arr[i];
            }

        }
        if (secondMax * 2 <= max) {
            return maxIdx;
        }
        return -1;
    }
}
