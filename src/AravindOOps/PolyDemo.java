package AravindOOps;

public class PolyDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.add(new int[]{1, 2, 2, 3, 5});
        obj.add(5,6);

        D obj1 = new D();
        obj1.add(new int[]{5,8,7,9,10});
    }
}

class C{//compile time - method overloading
    void add(int a,int b){
        System.out.println(a+b);
    }

    void add(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        System.out.println("The total sum is "+sum);
    }
}

class D extends C{//runtime polymorphism - method overriding
    void add(int arr[]){
        int prod=1;
        for(int i=0;i< arr.length;i++){
            prod*=arr[i];
        }
        System.out.println("The product is "+prod);
    }
}