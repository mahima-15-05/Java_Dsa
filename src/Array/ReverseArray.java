package Array;

import javax.crypto.ShortBufferException;
import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int houseNumbers[]){
        int start = 0,end=houseNumbers.length-1, temp;
        while(start<=end){
            temp = houseNumbers[start];
            houseNumbers[start]=houseNumbers[end];
            houseNumbers[end]=temp;
            start++;
            end--;
        }


    }
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
        // logic to  reverse the array
        reverse(houseNumbers);

        System.out.println("The reversed array is : ");

        for (int i = 0; i < houseNumbers.length; i++) {
            System.out.print(" " + houseNumbers[i]);

        }
    }
}
