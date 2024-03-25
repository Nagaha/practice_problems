package MOCKRound;

public class Set1Q2 {
    public static void main(String[] args) {
        int arr[]={10,36,54,89,12};
        int ans[][]=sortByWeights(arr);
        for (int x[]:ans){
            System.out.println(x[0]+" "+x[1]);
        }

    }

    private static int[][] sortByWeights(int[] arr) {
        int ans[][]=new int[arr.length][2];
        for (int i=0;i<arr.length;i++){
            int weight=0;
            if(arr[i]%4==0 && arr[i]%6==0){
                weight+=4;
            }
            if(arr[i]%2==0){
                weight+=3;
            }
            if(isPerfectSquare(arr[i])){//calling a function to check it is a perfect square or not
                weight+=5;
            }
            ans[i][0]=arr[i];
            ans[i][1]=weight;
        }
        //sorting based on the weights
        for(int i=0;i< ans.length-1;i++){
            for (int j=i+1;j< ans.length;j++){
                //For swapping the number and weight we use a temp array
                if(ans[i][1]>ans[j][1]){
                    int temp[]={ans[i][0], ans[i][1]};

                    ans[i][0]=ans[j][0];
                    ans[i][1]=ans[j][1];

                    ans[j][0]=temp[0];
                    ans[j][1]=temp[1];
                }
            }
        }
        return ans;
    }

    private static boolean isPerfectSquare(int num) {
        for (int i=2;i<num/2;i++){//naive method to check it is perfect square or not
            if(i*i==num){
                return true;
            }
            else if(i*i>num){//To reduce the number of times the loop runs
                return false;
            }
        }
        return false;
    }
}
