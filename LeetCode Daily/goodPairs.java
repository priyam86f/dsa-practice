import java.util.Arrays;
import java.util.HashMap;

public class goodPairs {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int ans = count_good_Pairs(nums);
        System.out.println(ans);
    }



    public static int count_good_Pairs(int[] nums){
    
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            if(map.containsKey(i)){
              res += map.get(i); 
              //update
              map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
       return res;

       

    }
}
