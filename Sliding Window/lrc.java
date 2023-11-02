import java.util.HashMap;

public class lrc {
    public static void main(String[] args) {
        String s = "AABCDBB";
        int res = longestcharrep(s, 2);
        System.out.println(res);
    }


    public static int longestcharrep(String s,int k){
        char[] S = s.toCharArray();
        int n = S.length;
        int i=0;
        int j=0;
        int res=0;
        int max = 0;
        int count=0;
        HashMap<Character,Integer> map = new HashMap<>();
        

        //variable size sliding window
      while(j<n){
    map.put(S[j], map.getOrDefault(S[j],0)+1);
    max = Math.max(max, map.get(S[j]));

         if((j-i+1) - max > k){
            map.put(S[i], map.get(S[i])-1);
            i++;
          }
          res= Math.max(res, j-i+1);
         j++; 
    }
return res;
    }
}