import java.util.HashMap;

public class minwinsubstr {
    public static void main(String[] args) {
        String s = "cabwefgewcwaefgcf", t = "cae";
       String ans=minwin(s, t);
       System.out.println(ans);
    }

    public static String minwin(String s,String t){
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        char[] s_arr = s.toCharArray();
        int n = s_arr.length;
        
        int min=Integer.MAX_VALUE;
        String ans="";

        for(char p : t.toCharArray()){
            map.put(p, map.getOrDefault(p, 0)+1);
        }

        int count=map.size();

        while(j<n){
             if(!map.containsKey(s_arr[j])){
                j++;
                continue;
             }
             else if(map.containsKey(s_arr[j])){
               map.put(s_arr[j], map.get(s_arr[j])-1);
               if(map.get(s_arr[j])==0){
                count--;
               }
               
             }

             if(count==0){
                if(min>j-i+1){
                  ans=s.substring(i,j+1);
                  min=Math.min(min,j-i+1);
                }

                while(count==0){
                    if(!map.containsKey(s_arr[i])){
                        i++;
                    }
                    else {
                        map.put(s_arr[i], map.get(s_arr[i])+1);
                        if(map.get(s_arr[i])>0){
                            count++;
                        }
                        i++;
                    }


                    if(count==0){
                        if(min>j-i+1){
                            ans=s.substring(i,j+1);
                            min=j-i+1;
                          }
                    }
                }
             }
             j++;
        }
        return ans;
    }
}
