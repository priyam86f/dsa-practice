/*Find and return the largest length of subarray whose sum equals K. */
public class subarraySumK {
    public static void main(String[] args) {
        int nums[] = {4,1,1,1,2,3,5};
        int res = sumequalsk(nums, 5);
        System.out.println(res);
    }

    public static int sumequalsk(int[] nums,int k){
        int sum = 0;
        int i=0;
        int j=0;
        int n = nums.length;
        int mx=0;

        while(j<n){
         sum+=nums[j];

         //condition 1
         if(sum < k){
            j++;
         }
         else if(sum==k){
             mx = Math.max(mx, j-i+1);
             j++;
         }
         else if(sum > k){
            while(sum>k){
                sum-=nums[i];
                i++;
            }
            j++;
         }
        }
        return mx;
    }


}
