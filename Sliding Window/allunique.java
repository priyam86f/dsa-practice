import java.util.HashMap;

public class allunique {
    public static void main(String[] args) {
        String s = "leetcode";
        int sol = kun(s);
        System.out.println(sol);
    }


    public static int kun(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        char[] sarr = s.toCharArray();
        int n = sarr.length;
        int i=0;
        int j=0;
        int max=0;

        while(j<n){
           map.put(sarr[j], map.getOrDefault(sarr[j], 0)+1);

            if(map.size()==j-i+1){
            max = Math.max(max, j-i+1);
            j++;
           }

            else if(map.size()<j-i+1){
              while(map.size()<j-i+1){
              map.put(sarr[i], map.get(sarr[i])-1);
              if(map.get(sarr[i])==0){
                map.remove(sarr[i]);
            }
            i++;
        }
        j++;
           }
         
          
        }
        return max;
    }
}
