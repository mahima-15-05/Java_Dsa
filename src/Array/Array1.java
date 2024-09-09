package Array;

import java.util.Scanner;

public class Array1 {

    public static void playWithArray(){
        int marks[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        for(int i=0; i<10;i++){
            marks[i]=sc.nextInt();

        }
        System.out.println("The array is ");
        for(int i=0; i<10;i++){
            System.out.print(" "+marks[i]+" ");

        }
    }
    public static void main(String[] args) {
    playWithArray();


    }
}
