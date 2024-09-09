package String;

import java.util.Scanner;

public class IsPalindrome {
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length()-1;
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;

            }
            start++;
            end--;
        }
        return true;
        //racecar
        //output - is Palindrome

    }

    public static void main(String[] args) {
        System.out.print("Enter a string to check if it is palindrome : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean result = isPalindrome(str);
        if (result) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }


    }
}
