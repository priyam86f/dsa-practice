import java.util.HashMap;

public class firstUniqueChar {
    public static void main(String[] args) {
        String s = "leetcode";
        int res = firstUniqChar(s);
        System.out.println(res);
    }



    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap();

        for(char i : s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
