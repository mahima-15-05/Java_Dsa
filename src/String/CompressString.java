package String;

public class CompressString {
    public static void compress(String s){
        String str="";
        for(int i=0; i<s.length();i++){
            Integer cnt =1;
            while(i<s.length()-1 && s.charAt(i)== s.charAt(i+1)){
                cnt++;
                i++;

            }
            str+=s.charAt(i);
            if(cnt>1){
                str+=cnt.toString();
            }
        }
        System.out.println("new string: "+str);

    }
    public static void main(String[] args) {
        String s = "aaabbbbccccc";
        compress(s);
    }
}
