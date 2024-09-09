package Array;

import java.util.Scanner;

public class PrintSubarrays {
    public  static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("[ ");
                for(int k=i; k<=j;k++){

                    System.out.print(" "+arr[k]+" ");
                    if(k<j){
                        System.out.print(",");
                    }
                }
                System.out.println(" ]");

            }
            System.out.println("----------------------------------");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter the elements array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Your array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]+ ", ");

        }
        System.out.println();

        print(arr);

    }
}
