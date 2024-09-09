package Recursion;

import com.sun.security.jgss.GSSUtil;

public class Print1ToN {
    public void print1ToN(int n){
        if(n==0){

            return;
        }
        //decreasing order

        System.out.print(n+" ");
        print1ToN(n-1);


        //    increasing order

        //    print1ToN(n-1);
        //    System.out.print(n+" ");

    }

    public static void main(String[] args) {
        Print1ToN p = new Print1ToN();
        int n=10;
        p.print1ToN(n);
    }
}
