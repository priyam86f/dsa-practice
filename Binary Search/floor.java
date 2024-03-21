public class floor {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7,8,9};
        int res = find_floor_of_element(nums, 10);
        System.out.println(res);
    }


    public static int find_floor_of_element(int[] nums, int target){
        int n = nums.length;
        int low=0;
        int high=n-1;
        int res=0;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(target==nums[mid]){
                return mid;
            }else if(nums[mid]>target){
                high=mid-1;
            }else if(nums[mid]<target){
                res = Math.max(res,mid);
                low=mid+1;
            }
        }
        return res;
    }
}

