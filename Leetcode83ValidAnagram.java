class Solution {
    public boolean isAnagram(String s, String t) {
        int count[]=new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;//incrementing the index with one(hashing)
        }
        for(char c:t.toCharArray()){
            count[c-'a']--;//decrementing the index with one(removing if equlas)
        }
        for(int a:count){
            if(a!=0) return false;
        }
        return true;
    }
}
