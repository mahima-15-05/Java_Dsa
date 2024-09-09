package Patterns;

import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the number of rows: ");
        n= sc.nextInt();

        char cnt= 'A';
        for(int i=0; i<n; i++){
            for(int j=0; j<=i;j++){
                System.out.print(" "+cnt+" ");
                cnt++;
            }
            cnt='A';
            System.out.println();
        }
    }
}
