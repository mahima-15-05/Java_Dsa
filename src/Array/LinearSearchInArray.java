package Array;

import java.util.Scanner;

public class LinearSearchInArray {
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
            System.out.print(" "+houseNumbers[i]);

        }
        System.out.println();
        System.out.println(" Enter the target value ");
        target = sc.nextInt();


        System.out.println("Searching the target "+ target+ " in the array...");
        int result =-1;
        for(int i=0; i<houseNumbers.length; i++){
            if(target==houseNumbers[i]){
                result = i;
                break;
            }
        }
        System.out.println("Result : "+result);
    }
}
