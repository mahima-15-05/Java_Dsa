package Recursion;

// T.C = O(2^n) // very big time complexity so Dynamic programming is prefered
// S.C = O(n)

public class NthFibonacciNumber {
    public static int NthFibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return NthFibo(n-1)+ NthFibo(n-2);

    }
    public static void main(String[] args) {
        int n=25;
        int res = NthFibo(n);
        System.out.println(res);

    }
}
