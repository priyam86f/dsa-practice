public class reverseBinarySearch {
    public static void main(String[] args) {
        int[] nums = {20,18,16,14,12,10,8,6,4,2};
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
            else if(target<=nums[mid]){
                low=mid+1;
            }
            else if(target>=nums[mid]){
                high=mid-1;
            }
        }
return -1; //if element not found..
    }
}
