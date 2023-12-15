import java.util.*;
public class closeStrings {
    public static void main(String[] args) {
        String A = "abbbcccd";
        String B = "baaadddc";
        boolean res = closeStrings(A, B);
        System.out.println(res);
    }


    public static boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }

        //string to charArr

        char[] word1_arr = word1.toCharArray();

        char[] word2_arr = word2.toCharArray();

        HashMap<Character,Integer> map1 = new HashMap();
         HashMap<Character,Integer> map2 = new HashMap();

        for(char p : word1_arr){
            map1.put(p,map1.getOrDefault(p,0)+1);
        }

        for(char p : word2_arr){
            map2.put(p,map2.getOrDefault(p,0)+1);
        }

        
        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }
       Integer[] values1 = map1.values().toArray(new Integer[0]);
       Integer[] values2 = map2.values().toArray(new Integer[0]);

        Arrays.sort(values1);
        Arrays.sort(values2);

        return Arrays.equals(values1, values2);




    }
}
