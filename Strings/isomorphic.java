import java.util.HashMap;

public class isomorphic {
    public static void main(String[] args) {
        String s1 = "berr";
        String s2 = "mehg";
        boolean res = iso_Strings(s1, s2);
        System.out.println(res);
    }
    

    public static boolean iso_Strings(String s,String t){
        HashMap<Character,Character> mapST = new HashMap<>();
        HashMap<Character,Character> mapTS = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if((mapST.containsKey(c1) && mapST.get(c1)!=c2) || mapTS.containsKey(c2) && mapTS.get(c2)!=c1){
                return false;
            }

            mapST.put(c1,c2);
            mapTS.put(c2,c1);


           

        }
        return true;
    }
}
