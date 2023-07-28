import java.util.HashSet;

public class DistinctSlidingWIndow {
    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        long res = distinct(nums, 3);
        System.out.println(res);
    }


    public static long distinct(int[] nums,int k){
        HashSet<Integer> set = new HashSet<>();
        long sum=0;
        long max=0;
        int i=0;
        int j=0;
        for(j=0;j<nums.length;j++){
          while(i<j && (set.contains(nums[j])||set.size()>=k)){
            sum-=nums[i];
            set.remove(nums[i]);
            i++;  
          }
          sum+=nums[j];
          set.add(nums[j]);

          if(set.size()==k){
             max = (long)Math.max(max, sum);
          }
        }
        return max;
    }
}
