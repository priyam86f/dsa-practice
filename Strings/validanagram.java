import java.util.*;
public class validanagram {
    public static void main(String[] args) {
        String s = "mobile";
        String t = "omibel";
        boolean sol = isAnagram(s, t);
        System.out.println(sol);
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        //char array
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        HashMap<Character,Integer> map1 = new HashMap();
        HashMap<Character,Integer> map2 = new HashMap();

        for(char l : sarr){
            map1.put(l,map1.getOrDefault(l,0)+1);
        }

        for(char m : tarr){
            map2.put(m,map2.getOrDefault(m,0)+1);
        }
        if(map1.equals(map2)){
            return true;
        }
return false;

    }
}
