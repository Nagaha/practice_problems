package Zoho;
/*33. First Occurrences
Given two strings, find the first occurrence of all characters of second string in the first string and
print the characters between the least and the highest index
I/P: ZOHOCORPORATION PORT
O/P: OHOCORPORAT
Explanation: The index of P in first string is 7, O is 1, R is 6 and T is 11. The largest range is 1 – 11.
So print the characters of the first string in this inex range i.e. OHOCORPORAT*/
public class Z_D33 {
    public static void main(String[] args) {
        String str1="ZOHOCORPORATION";
        String str2="PORT";
        String ans=specialStr(str1,str2);
        System.out.println(ans);
    }

    private static String specialStr(String mStr, String sStr) {
        //The approach is simple we are finding the index of first occurrence of character using indexOf()

        int min=mStr.length();
        int max=-1;
        for(int i=0;i<sStr.length();i++){
            min=Math.min(mStr.indexOf(sStr.charAt(i)),min);
            //We check and change the min and max index for each character in substring and with min and max index we return the substring
            max=Math.max(mStr.indexOf(sStr.charAt(i)),max);
            System.out.println(min+" "+max);
        }
        return mStr.substring(min,max+1);
    }
}
