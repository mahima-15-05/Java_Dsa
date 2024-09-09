package String;
/*
* In java String are IMMUTABLE
* When some operations are performed the original string does not change, the new string is made
* "sc.next() only takes the string as an input until first space is not met. eg- 'Mahima Tripathi' it will store 'Mahima'
* "sc.nextLine() takes the whole line of string even when seperated by spaces. eg- 'Mahima Tripathi' it will store the whole...
* ...string
*
* In array length is a property so we use arr.length;
* But in String length() is a method i.e., String str ="Maahi"; str.length();//5
*/

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        char s[] = {'a', 'b', 'c', 'd'};

//        Method 1 of declaring string
//        String str = "abcd";
//        str = "sjf"; //reinitialization is possible
//        System.out.println(str);

//        Method 2 of declaring string
//        String str1 = new String("abcd");
        System.out.print("Enter your name: ");
//        String name = sc.next();
        String name = sc.nextLine();
        System.out.println("Your name is "+name);

//        charAt(index);
        for(int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i)+" ");
        }
    }
}
