/*Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.*/

class Solution
{
    public static void sort012(int a[], int n)
    {
        int low=0,mid=0,high=n-1;
        //low points to lower part of array (0s)
        //mid to middle(1s)
        //high to last part(2s)
        while(mid<=high){
            if(a[mid]==0){//if the mid is 0 its should be moved to left which is low
                int temp=a[mid];
                a[mid]=a[low];
                a[low]=temp;
                mid+=1;
                //Incrementing the indexes
                low+=1;
            }
            else if(a[mid]==1){
                mid+=1;//if it is already in mid then no worries
            }
            else{//for last if it is 2 then it shoulb be in right
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high-=1;
                //updating the indexes as high is from rear
            }
        }
    }
}
