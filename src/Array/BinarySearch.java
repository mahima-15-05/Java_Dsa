package Array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int houseNumbers[] = new int[5];
        int target;

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the house numbers in array");
        for (int i = 0; i < houseNumbers.length; i++) {
            houseNumbers[i] = sc.nextInt();

        }
        System.out.println("Your array is :");
        for (int i = 0; i < houseNumbers.length; i++) {
            System.out.print(" " + houseNumbers[i]);

        }
        System.out.println();
        System.out.println(" Enter the target value ");
        target = sc.nextInt();


        System.out.println("Searching the target " + target + " in the array...");

        int start = 0;
        int mid;
        int end = houseNumbers.length - 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (houseNumbers[mid] == target) {
                System.out.println("Target is found at index " + mid);
                return;
            }

            // 2,3,4,5,6,7,8,9,10 target =5
            if (houseNumbers[mid] < target) {
                start = mid+1;


            }
            if (houseNumbers[mid] > target) {
                end = mid-1;

            }


        }
        System.out.println("Not found");
    }
}
