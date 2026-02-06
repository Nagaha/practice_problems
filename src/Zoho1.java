/*
* input:
* s=["hello","hey","yellow"]
* q="hell"
* output:
* "hello"
* because hello has the highest number of 2 anagrams
* */
public class Zoho1 {
    public static void main(String[] args) {
        String s[]={"hello","hey","yellow"};
        String q="hell";
        String res=findAnagram(s,q);
        System.out.println("The answer is: "+res);

    }

    private static String findAnagram(String[] s,String q) {
        int max_count=0;
        int curr_count=0;
        String similar = null;
        for(int i=0;i<s.length;i++){//Traverses through each element in array
            for(int j=0;j<s[i].length()-1;j++){//Traverses through each string
                for(int k=0;k<q.length()-1;k++){
                    //Checking condition for each two chars from string and target
                    if(s[i].charAt(j)==q.charAt(k) && s[i].charAt(j+1)==q.charAt(k+1)){
                        curr_count+=1;//For each favorable condition count is increased
                    }
                }
                if(max_count<curr_count){//Tracks the max similarity
                    max_count=curr_count;
                    similar=s[i];//keeps the similar anagram
                }
                curr_count=0;//for each string curr_count becomes 0

            }
        }
        return similar;
    }
}
