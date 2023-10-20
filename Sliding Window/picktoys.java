import java.util.*;
public class picktoys {
    public static void main(String[] args) {
        int fruits[] = {1,1};
        int sol = totalFruit(fruits);
        System.out.println(sol);

    }


    public static int totalFruit(int[] fruits) {
        int k = 2;
        int n = fruits.length;
        int i=0;
        int j=0;
        int max = 0;

        HashMap<Integer,Integer> map = new HashMap();

        while(j<n){
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);

            if(map.size()< k){
                j++;
            }
            else if(map.size()==k){
                max = Math.max(max,j-i+1);
                j++;
            }
             if(map.size()>k){
                while(map.size()>k){
                    map.put(fruits[i],map.get(fruits[i]) -1);
                    if(map.get(fruits[i])==0){
                        map.remove(fruits[i]);
                    }
                    i++;
                }
                j++;
            }
        }
        if (max == 0) {
            return fruits.length;
        } else {
            return max;
        }
    }
}
