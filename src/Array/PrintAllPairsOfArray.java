package Array;

import java.util.Scanner;

public class PrintAllPairsOfArray {
    public static void printPairs(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++ ){
                System.out.print("( "+arr[i]+","+arr[j]+ " )   ");
            }
            System.out.println();
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
            System.out.print(" " + arr[i]);

        }
        System.out.println();

        printPairs(arr);
    }
}
