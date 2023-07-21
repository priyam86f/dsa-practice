public class bs{
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10,12,14,16,18,20,22,24};
        int ans = bsalgo(nums, 20);
        System.out.println(ans);

    }

    public static int bsalgo(int[] nums,int target){
        int n = nums.length;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid = low + (high-low)/2; //avoids integer overflow.

            if(target==nums[mid]){
                return mid;
            }
            else if(target>=nums[mid]){
                low=mid+1;
            }
            else if(target<=nums[mid]){
                high=mid-1;
            }
        }
return -1; //if element not found..
    }
}