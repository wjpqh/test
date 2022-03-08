import java.awt.*;

public class oom {
    public static void main(String[] args) {
            String  s="ababc";
            int max=0;
        for (int i = 0; i < s.length(); i++) {
            for (int k= i+1; k< s.length(); k++) {
                String now=s.substring(i,k);
                if(ishuiwen(now)&&now.length()>max){
                    max=now.length();
                }

            }
        }
        System.out.println(max);
        System.out.println(max);
        System.out.println(max);

    }

    public static boolean ishuiwen(String s){
       char[] chars= s.toCharArray();
        for (int i = 0; i <chars.length/2 ; i++) {
            if(chars[i]!=chars[chars.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
