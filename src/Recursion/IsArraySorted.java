package Recursion;

public class IsArraySorted {
    public static boolean isSorted(int a[], int s){
        if(s==a.length-1){
            return true;

        }
        if(a[s]<a[s+1]){
            return isSorted(a,s+1);
        }
        if(a[s]>a[s+1]) return false;
return false;
    }
    public static void main(String[] args){
        int a[] = {1,3,2,6,8,9};
        int s=0;
        System.out.println(isSorted(a,s));


    }
}
