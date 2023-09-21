class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int top=a.length()-1;
        int bottom=b.length()-1;
        int carry=0;
        while(top>=0 ||bottom>=0){//checking whether the no out of bound
            int sum=carry;
            if(top>=0) sum+=a.charAt(top)-'0';//getting the character and converting to int
            if(bottom>=0) sum+=b.charAt(bottom)-'0';
            sb.append(sum%2);//if sum is 2 ie(1+1) then append 0
            sum=sum/2;
            carry=sum;//giving carry for next value
            top--;
            bottom--;
        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
