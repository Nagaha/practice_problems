package ZohoL2.src.Accenture;

public class FrequencyCharacters {
    public static void main(String[] args) {
        int ans=findOccurence("aravind",'v');
        System.out.println(ans);
    }

    private static int findOccurence(String str, char target) {
        int count=0;
        for(char x:str.toCharArray()){
            if(x==target){
                count++;
            }
        }
        return count;
    }
}
