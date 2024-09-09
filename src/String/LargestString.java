package String;

import java.util.Scanner;
/*
Lexicographic comparison
i.e., "apple" < "banana" because ,
      apple starts with 'a' and banana starts with 'b'
* str1.compareToIgnoreCase(str2); // capital and small letters are treated same
* str1.compareTo(str2) , it is a funtion whichis used to compare to strings
* it returns '0' is both the strings are equal
* returns -ve value str1 < str2
* returns +ve value if str1 > str2
*/

public class LargestString {
    public static String findLargestString(String array[]){
        String largest = array[0];


        for(int i=0; i<array.length; i++){
            int res= largest.compareToIgnoreCase(array[i]);
          if(res<0){
              largest = array[i];
          }
        }
        return largest;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String array[] = new String[5];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<array.length; i++){
            array[i]= sc.next().toLowerCase();
        }

        //printing array elements
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        String largest = findLargestString(array);
        System.out.println("Largest : "+largest);


    }
}
