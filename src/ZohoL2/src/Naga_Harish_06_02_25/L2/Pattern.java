package ZohoL2.src.Naga_Harish_06_02_25.L2;

public class Pattern {
    public static void main(String[] args) {
        int n=16;
        if(n%2==0){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(j==0 || i==0 || j==n-1 || i==n-1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print(". ");
                    }

                }
                System.out.println();
            }
        }
        else{
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i%2==0 || j==n-1){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print(". ");
                    }
                }
                System.out.println();
            }
        }

    }
}
