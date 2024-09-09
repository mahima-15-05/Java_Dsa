package String;

public class CapitalizeFirstLetter {
    public static void capitalize(String s) {
        StringBuffer sb = new StringBuffer("");
        char ch = Character.toUpperCase(s.charAt(0));
        sb.append(ch);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i < s.length() - 1) {
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));

            } else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }


    public static void main(String[] args) {
        String s = "apple ball cat dog elephant";
        capitalize(s);


    }
}
