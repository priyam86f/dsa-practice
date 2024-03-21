public class ceil {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6,7};
        int res = find_ceil_of_element(nums, 4);
        System.out.println(res);
    }


    public static int find_ceil_of_element(int[] nums,int target){
        int n = nums.length;
        int low=0;
        int high=n-1;
        int res=Integer.MAX_VALUE;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                low=mid+1;
            }else if(nums[mid]>target){
                res=Math.min(res,mid);
                high=mid-1;
            }
        }
        return res;
    }
}
