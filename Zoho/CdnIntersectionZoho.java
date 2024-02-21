import java.util.* ;
import java.io.*; 
public class Solution
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		 ArrayList<Integer> ans=new ArrayList<>();

        int i=0,j=0;
        //The approach is simple just we use pointers for two arraylists and we check for 
        //Intersection in the arrayLists 

        while(i<n && j<m){

            if(arr1.get(i).equals(arr2.get(j))){

                ans.add(arr1.get(i));

                i++;

                j++;
                //If found add them to ans arrayList and move the pointers

            }

            else if(arr1.get(i)<arr2.get(j)){

                i++;
                //If not found move only the lowest valued pointer

            }

            else{

                j++;

            }

        }

        return ans;
	}
}
