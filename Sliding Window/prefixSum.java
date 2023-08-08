/*This code is just to present the concept of 'Prefix Sum' 
 * Prefix Sum Concept - 
   if there exists x-k, where x is the sum of all elements and k is at a given point,
   we find the difference between the indexes of k and end of x-k, and return the largest
   length subarray.
*/
import java.util.HashMap;

public class prefixSum {
    public static void main(String[] args) {
        int[] nums = {2,3,5,1,9};
        int res = longestSubArr(nums, 10);
        System.out.println(res);
    }

    public static int longestSubArr(int[] nums, int k){
        int max=0;
        int prefixSum=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i]; //store the prefix sum upto ith index.

            if(prefixSum==k){
                max=Math.max(max, i+1);
            }

            /*now we need to check whether x-k exists in the map,
             * if it does, find the max length by subtracting i and the end of x-k.
             */
            int rem = prefixSum - k; /*if the map contains the totalsum - k, we simply find the maxlength. */
            if(map.containsKey(rem)){
                //get the index
                int len = i - map.get(rem);
                max = Math.max(max, len);
            }

            if(!map.containsKey(prefixSum)){
                map.put(prefixSum, i);
            }
        }
        return max;
    }
}
