public class minElement {
    public static void main(String[] args) {
        //find how many times a sorted array is rotated
        //find minimum element in rotated sorted array
        int[] nums = {11,12,15,18,2,5,6,8};
        int res = minel(nums);
        System.out.println(res);
    }


    public static int minel(int[] nums){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int res=0;

    

        while(low<=high){
           
            int mid = low + (high-low)/2;

            int next = (mid + 1)%n;
            int previous = (mid + n - 1)%n;

            if(nums[mid]<=nums[next] && nums[mid]<=nums[previous]){
              return mid;
            }
            else if(nums[mid]<=nums[high]){
                high=mid-1;
            }

             else if(nums[low]<=nums[mid]){ //checking the search space
                low=mid+1;
            }
            

        }
        return 0;

    }
}
