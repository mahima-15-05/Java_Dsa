package String;
/*
String s = "HelloWorld"
* Substring - made from the consequtive characters i.e, lloW, Worl, Hello
* Subsequence - made by letters in any order i.e, HllW, eWod
*/

public class SubStrings {
    public static void printSubString(String s, int start, int end){
        for(int i=start; i<end;i++){
            System.out.print(s.charAt(i)+" ");

        }

    }
    public static void main(String[] args) {

        String s = "HelloWorld";
        int start=4;
        int end=s.length()-2;
        printSubString(s,start,end);

        // java has an inbuilt function  s.substring(2,5);
        System.out.println("Substring will be "+s.substring(0,5));


    }
}
