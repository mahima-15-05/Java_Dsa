package Backtracking;

public class ArrayBacktrack {
    public static void assignFun(int a[], int st){

        if(st==5){
            System.out.println("Array changed to ");
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
            return;
        }
        a[st]=st+1;
        assignFun(a,st+1);
        a[st]=a[st]-2;
        return ;
    }

    public static void main(String[] args) {
        int a[]= new int [5];
        int start =0;
        assignFun(a,start);
        System.out.println("Your array is - ");
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
