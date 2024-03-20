public class findNumberOfRotations {
    public static void main(String[] args) {
         int[] nums = {11,12,15,18,2,5,6,8};
         int res = find_number_of_times_array_rotated(nums);
         System.out.println(res);
    }   


    public static int find_number_of_times_array_rotated(int[] nums){
       
        int n= nums.length;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            int next = (mid+1)%n;
            int previous = ((mid+n)-1)%n;

            if(nums[mid]<=nums[next] && nums[mid]<=nums[previous]){
                return mid;
            }else if(nums[mid]<=nums[high]){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }

        return -1;

    }
}
