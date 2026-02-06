import java.util.ArrayList;

public class AllSequences {

    static int arr[] = {5,1,6};
    static int count=0;
    static int totalsum=0;
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        printAll(0, list);
        System.out.println(totalsum);
    }

    private static void printAll(int idx, ArrayList<Integer> list) {
        if (idx >= arr.length) {
            int sum=0;
            for(int x:list){
                sum^=x;
            }
            totalsum+=sum;

            return;
        } else {
            // Include the element at current index
            list.add(arr[idx]);
            printAll(idx + 1, list);

            // Exclude the element at current index
            list.remove(list.size() - 1); // Remove the last element
            printAll(idx + 1, list);
        }

    }
}
