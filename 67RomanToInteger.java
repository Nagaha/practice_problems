class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int sum=0;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='V' || s.charAt(i)=='X'){
                if(i>0 && s.charAt(i-1)=='I') sum-=2;
            }
            if(s.charAt(i)=='L' || s.charAt(i)=='C'){
                if(i>0 && s.charAt(i-1)=='X') sum-=20;
            }
            if(s.charAt(i)=='D' || s.charAt(i)=='M'){
                if(i>0 && s.charAt(i-1)=='C') sum-=200;
            }
            sum=sum+map.get(s.charAt(i));
        }
        return sum;
    }
}
