public class optimalSW {
    /*Find the max sum of subarray of size K optimal approach */
    public static void main(String[] args) {
        int[] nums = {2,3,5,2,9,7,1};
        int res = SLIDING_WINDOW_OPTIMAL(nums, 3);
        System.out.println(res);
    }


    public static int SLIDING_WINDOW_OPTIMAL(int[] nums, int k){
        
        int n = nums.length;
        int i = 0; //start
        int j = 0; //end
        int mx = Integer.MIN_VALUE;
        int sum = 0;

        while(j<n){
            sum=sum+nums[j];
            if(j - i + 1 < k){
                j++;
            }else if(j-i+1==k){ //window size reached
              mx = Math.max(mx, sum);
              sum = sum - nums[i];
              i++;
              j++;
            }
        }
        return mx;
    }
}
