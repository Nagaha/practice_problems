package Zoho;
/*31. 1. Pangram Checking
Check whether all english alphabets are present in the given sentence or not
I/P: abc defGhi JklmnOP QRStuv wxyz
O/P: True
I/P: abc defGhi JklmnOP QRStuv
O/P: False*/
public class Z_31 {
    public static void main(String[] args) {
        String str="abc defGhi JklmnOP QRStu wxyz";
        boolean ans=checkAlphabets(str);
        System.out.println(ans);

    }

    private static boolean checkAlphabets(String str) {
        int arr[]=new int[27];//creating a hash array to maintain the count of occurrence
        for(int i=0;i<str.length();i++){//we traverse through the string and add the count
            char temp=str.charAt(i);
            if(Character.isAlphabetic(temp)){//Checking whether it is a alphabet or not
                int place=(int)(Character.toLowerCase(temp))-96;//changing to lowercase and updating array
                arr[place]++;
            }
        }
        for(int i=1;i< arr.length;i++){//checking the array
            if(arr[i]==0 || arr[i]>1){//in case of more than one time presence are absence any character
                return false;
            }
        }
       return true;

    }
}
