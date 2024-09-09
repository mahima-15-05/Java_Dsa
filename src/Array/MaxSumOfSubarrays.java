package Array;
/*
* KADANE'S algorithm is used to find maximum sum of a sub-array
* According to it ---
* if sum o adding an element is becoming -ve then proceed with 0
*
*/

import java.util.Scanner;

public class MaxSumOfSubarrays {
    public static void maxSum(int arr[]) {
//        int prefixSum[] = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int sum = 0;

                 //removing this loop and using prefixSum array
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }

                if (maxSum < sum) {
                    int start = i;
                    int end = j;
                    maxSum = sum;
                }
            }
        }
        System.out.println("Max sum is " + maxSum);

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
            System.out.print(" " + arr[i] + ", ");
        }
        System.out.println();

        maxSum(arr);
    }
}
