package Vaishnav;

import java.util.Stack;

public class Aravind {
    public static void main(String[] args) {
//        int arr[]=new int[]{6,10,14,78,56,89};
//        int secondLargest=getSecondLargest(arr);
//        System.out.println(secondLargest);

        String paranthesis="(())))";
        boolean isValid=checkValid(paranthesis);
        System.out.println(isValid);


    }

   public static boolean checkValid(String str){
        Stack<Character> box=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(')
            {
                box.push('(');
            }
            else if(box.isEmpty()==false){
               if( box.peek()=='(')
               {
                   box.pop();
               }
            }
            else if (box.isEmpty()==true)
                {
                    return false;
                }

        }
        if(box.isEmpty()==false)
        {
            return false;
        }
        return true;
   }

    public static int getSecondLargest(int arr[]){
        int largest=0;
        int secondLargest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest)
            {
                secondLargest=largest;
                largest=arr[i];
            }
            else if(largest>arr[i] && arr[i]>secondLargest)
            {
                secondLargest=arr[i];
            }

        }


        return secondLargest;

    }
}
