public class nearlySorted {
    public static void main(String[] args) {
        int[] nums = {20,10,30,2000,40};
        int target = 20;
        int res = search_in_nearly_sorted_arr(nums, target);
        System.out.println(res);
    }

    public static int search_in_nearly_sorted_arr(int[] nums,int target){
        int n = nums.length;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]==target){
                return mid;
            }else if(mid-1>=low && target==nums[mid-1]){
                return mid-1;
            }else if(mid+1<=high && target==nums[mid+1]){
                return mid+1;
            }else if(target>=nums[mid]){
                low=mid+2;
            }else{
                high=mid-2;
            }
        }
        return -1;
    }
}
