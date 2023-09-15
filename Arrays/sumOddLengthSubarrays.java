public class sumOddLengthSubarrays {
    public static void main(String[] args) {
        int[] nums = {1,4,2,5,3};
        int res = sum_odd_ln(nums);
        System.out.println(res);

    }


    public static int sum_odd_ln(int[] nums){

        int sum  = 0;
        for(int i=0;i<nums.length;i++){
            int left = i+1;
            int right = nums.length-i;
            int possible_subarrays = left*right;
            int odd_subarrays = possible_subarrays%2==0?possible_subarrays/2 : possible_subarrays/2+1;
            sum += odd_subarrays*nums[i];
        }
        return sum;
    }
}
