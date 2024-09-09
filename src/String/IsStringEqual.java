package String;

public class IsStringEqual {
    public static void main(String[] args) {
        String s1 ="Maahi";
        String s2 = "Maahi";
        String s3 = new String("Maahi");

        //'==' tells about object level equality
        //'s1.equals(s3)' tells about equality of values

        if(s1==s2){ // s1 and s2 is pointing to the same object
            System.out.println("Strings are equal on object level");
        }
        else{
            System.out.println("Strings are not equal on object level");
        }
        if(s1==s3){

            // s1 and s3 are not equal according to '==' operator,
            // because == tells that whether s1 ans s2 are pointing to same object or not, since if we dont use new keyword and
            // we give a same value it does not create object but points to the same object , but if we use new it creates
            // another object

            System.out.println("Strings are equal on object level");
        }
        else{
            System.out.println("Strings are not equal on object level");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal by value");

        }else{
            System.out.println("Strings are not equal by value");
        }
    }
}
