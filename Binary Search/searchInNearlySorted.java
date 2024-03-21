public class searchInNearlySorted {
    public static void main(String[] args) {
        int[] nums = {2,10,30,20,40};
        int res = binarySearch_nearly_Sorted_Arr(nums, 20);
        System.out.println(res);
    }


    public static int binarySearch_nearly_Sorted_Arr(int[] nums,int target){
        int n = nums.length;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(mid-1>=low && target==nums[mid-1]){
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
