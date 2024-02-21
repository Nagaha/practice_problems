/*
Given 3 Strings, check whether the 3rd string contains all the characters of string 1 and 2 in any order. If all the characters are present, print "YES" otherwise print "NO".

There should not be any extra character and any missing character.

The string s contains uppercase Latin letters only.

Sample Input 1 :
SANTACLAUS
DEDMOROZ
SANTAMOROZDEDCLAUS
Sample Output 1 :
YES
Sample Input 2 :
PAPAINOEL
JOULUPUKKI
JOULNAPAOILELUPUKKI
Sample Output 2 :
NO
Sample Input 3 :
BABBONATALE
FATHERCHRISTMAS
BABCHRISTMASBONATALLEFATHER
Sample Output 3 :
NO
Sample Output Explanation :
Output 1 : the letters written in the last line can be used to write the names and there won't be any extra letters left.
Output 2 : Letter "P" is missing and there's an extra letter "L"
Output 3 : There's an extra letter "L"*/

import java.util.Arrays;
public class Solution {

	
	public static void answer(String s1,String s2,String s3)
	{
         int l1=s1.length();
		 int l2=s2.length();
		 int l3=s3.length();
		 //We create a new array of chracters for storing the merged two arrays
		 if(l3!=(l1+l2)){
			 System.out.print("NO");
			 return;
		 }
		 //This is a case where if the length mismatches
		 char arr1[]=new char[l1+l2];
		 for(int i=0;i<l1;i++){
			 arr1[i]=s1.charAt(i);
		 }
		 int k=0;
		 for(int i=l1;i<l1+l2;i++){
			 arr1[i]=s2.charAt(k);
			 k++;
		 }
		 //We insert the characters to the array
		 char arr2[]=s3.toCharArray();
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 //After sorting checking by each element
		 for(int i=0;i<arr2.length;i++){
			 if(arr2[i]!=arr1[i]){
				 System.out.println("NO");
				 return;
				 //In case of mismatch
			 }
		 }
		 System.out.println("YES");
	}
	

	
}
