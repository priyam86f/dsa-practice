import java.util.HashMap;

public class kuniquechars {
    public static void main(String[] args) {
        String s = "abacbebe";
        int res = unique_chr_varsw(s, 3);
        System.out.println(res);

    }


    public static int unique_chr_varsw(String s,int k){

        char[] string = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();

        int n = string.length;
        int i=0;
        int j=0;
        int max = 0;
        int counter=0;

        while(j<n){
            map.put(string[j], map.getOrDefault(string[j], 0)+1);

            if(map.size()<k){
             j++;
            }
            else if(map.size()==k){
              max = Math.max(max, j-i+1);
              j++;
            }

            if(map.size()>k){
                while(map.size()>k){
                    map.put(string[i], map.get(string[i])-1);
                    if (map.get(string[i])==0){
                        map.remove(string[i]);
                    }
                        i++;
                }
                j++;
                }
                
            }
        
        return max;

    }
}
