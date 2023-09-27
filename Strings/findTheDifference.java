import java.util.Arrays;

public class findTheDifference{
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char ans = letter_difference(s, t);
        System.out.println(ans);
    }

    public static char letter_difference(String s,String t){
       int res = 0;

       for(char c : s.toCharArray()){
        res^=c;
       }

       for(char c : t.toCharArray()){
        res^=c;
       }
       return (char)res;

    }

   
}