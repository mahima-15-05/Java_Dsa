package Backtracking;

public class FindSubsets {
    public static void findSubsets(String s, String ans, int i){
        //base case
        if(i==s.length()){
            if(ans.length()==0){
                System.out.print("null");
            }
            System.out.println(ans);
            return;
        }

        //recursion

        //yes choice
        findSubsets(s,ans+s.charAt(i),i+1);

        //no choice
        findSubsets(s,ans,i+1);
    }

    public static void main(String[] args) {
        String a = "abc";
        String ans="";
        findSubsets(a,ans,0);
    }
}
