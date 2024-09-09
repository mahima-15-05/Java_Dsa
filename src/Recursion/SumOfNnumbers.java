package Recursion;

public class SumOfNnumbers {
    public static int  printSum(int n){
        if(n==0){
            return 0;
        }
        return n + printSum(n-1);

    }
    public static void main(String[] args) {
        int n=4;
        int res = printSum(n);
        System.out.println("The sum is "+res);
    }
}
