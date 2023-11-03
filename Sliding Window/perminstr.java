import java.util.HashMap;

public class perminstr {
    public static void main(String[] args) {
        String s1="abb";
        String s2="eidbbaooo";
        boolean res = perm(s1, s2);
        System.out.println(res);
    }


    public static boolean perm(String s1,String s2){
        boolean ans = false;
        int k = s1.length();
        int n = s2.length();
        char[] s1arr = s1.toCharArray();
        char[] s2arr = s2.toCharArray();
        HashMap<Character,Integer> mapFors1 = new HashMap<>();
        HashMap<Character,Integer> mapFors2 = new HashMap<>();

        for(char t : s1arr){
           mapFors1.put(t, mapFors1.getOrDefault(t, 0)+1);
        }
        //window size == n
        int i=0;
        int j=0;

        while(j<n){
            mapFors2.put(s2arr[j], mapFors2.getOrDefault(s2arr[j], 0)+1);

            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(mapFors1.equals(mapFors2)){
                    ans=true;
                    break;
                }else{
                    mapFors2.put(s2arr[i],mapFors2.get(s2arr[i])-1);

                    if(mapFors2.get(s2arr[i])==0){
                        mapFors2.remove(s2arr[i]);
                    }
                  
                }
                i++;
                j++;
            }
           
        }
        return ans;
    }
}
