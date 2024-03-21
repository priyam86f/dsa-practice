public class ceilOfAlphabet {
    public static void main(String[] args) {
        char[] nums = {'a','b','c','d','e'};
        char  res = find_ceil_of_alphabet(nums, 'd');
        System.out.println(res);
    }



    public static char find_ceil_of_alphabet(char[] nums,char target){
        int n = nums.length;
        int low=0;
        int high=n-1;
        int res=0;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]<=target){
               low=mid+1;
            }else if(nums[mid]>=target){
                res=mid;
                high=mid-1;
            }
        }
        return nums[res];
    }
}
