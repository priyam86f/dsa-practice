//optimal O(1)
public class longestSubarraySumK {
    public static void main(String[] args) {
        int[] nums = {4,1,1,2,3,5};
        int res = subarraySum(nums,3);
        System.out.println(res);
    }


    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
     int count=0;
     int max=0;
     int left=0;
     int right=0;
     int sum = nums[0];

     while(right < n){
      //left condition
      while(left <= right && sum > k){
          sum -= nums[left];
          left++;
      }

      if(sum == k){
        max = Math.max(max,right - left + 1);
        
      }

      right++;
      if(right<n){
          sum+=nums[right];
      }
     }
     return max;
    }
}
