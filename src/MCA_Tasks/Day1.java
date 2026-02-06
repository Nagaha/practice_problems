package MCA_Tasks;
/**
 * Write a program to check whether a number is factorial or not*/
public class Day1 {
    public static void main(String[] args) {
        int num=120;
        boolean ans=checkFactorial(num);
        System.out.println(ans);
    }

    private static boolean checkFactorial(int num) {
        for(int i=1;;i++){//We go from 1 to infinite
            if(num%i==0){
                num/=i;//Each time we divide the number with value i
            }
            else{
                break;//If the num is not divisible we break
            }
        }
        if(num==1){//if num is 1 the value is factorial
            return true;
        }
        return false;
    }
}
