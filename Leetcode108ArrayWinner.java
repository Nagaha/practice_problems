class Solution {
    public int getWinner(int[] arr, int k) {
        if(k==1){
            return Math.max(arr[0],arr[1]);
        }
        if(k>=arr.length){
            int max=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
        }
        int winner=arr[0];
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(winner>arr[i]){
                count++;
            }
            else{
                winner=arr[i];
                count=1;
            }
            if(count==k){
                return winner;
            }
        }
        return winner;
    }
}
