public class searchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int minIndex = find_min_index(nums);
        int search1 = binarySearch(nums,0,minIndex-1,7);
        int search2 = binarySearch(nums, minIndex, nums.length-1, 7);
        if(search1>search2){
            System.out.println(search1);
        }else{
            System.out.println(search2);
        }
    }

    //search element in a rotated sorted array

    //1 first find the number of times array was rotated i.e index of min element
    //2 by this the left of min index is sorted and right is also sorted
    //3 just apply BS on left and right

    public static int find_min_index(int[] nums){
        int n = nums.length;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            int next = (mid+1)%n;
            int previous = (mid+n-1)%n;

            if(previous>=nums[mid] && next>=nums[mid]){
                return mid;
            }else if(nums[mid]<=nums[high]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums,int low,int high,int target){
        int n = nums.length;
         low=0;
         high=n-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target>=nums[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
