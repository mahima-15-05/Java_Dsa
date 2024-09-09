package Patterns;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n = 5;
        for (int i = n; i>=0;i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}