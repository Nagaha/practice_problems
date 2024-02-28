package Zoho;
/*Input  : "abc de"
Output : edc ba

Input : "intern at geeks"
Output : "skeegt an retni"

Input : "Help others"
Output: "sreh topleH"
*/
public class ReverseSpace {
    public static void main(String[] args) {
       String ans=reverseWithoutSpace("abc de");
        System.out.println(ans);
    }

    private static String reverseWithoutSpace(String str) {
        //the approach is simple we convert the string to character array
        char arr[]=str.toCharArray();

        int left=0;
        int right=arr.length-1;
        //we use two pointers approach where start from both the ends
        while(left<=right){
            if(arr[left]==' '){
                left++;
                //When we encounter a empty space we ignore it and move on 
            }
            else if(arr[right]==' '){
                right--;
                //When we encounter a empty space we ignore it and move on 
            }
            else{
                //Once we get values in both the pointers we swap them and move the pointers
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        StringBuilder ans=new StringBuilder();
        //In a string builder we append the array and return it as string
        for(char x:arr){
            ans.append(x);
        }
        return ans.toString();
    }
}
