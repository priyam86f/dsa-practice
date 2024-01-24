public class setmismatch {
    public static void main(String[] args) {
        int[] nums= {1,2,2,4};
        int[] res = findErrorNums(nums);
        printArray(res);
    }



    public static int[] findErrorNums(int[] nums) {
        int N = nums.length;
        int x = 0; // duplicate - missing
        long y = 0; // duplicate^2 - missing^2 (using long to prevent integer overflow)

        for (int i = 1; i <= N; i++) {
            x += nums[i - 1] - i;
            y += (long) nums[i - 1] * nums[i - 1] - (long) i * i;
        }

        int missing = (int) ((y - Math.pow(x, 2)) / (2.0 * x));
        int duplicate = missing + x;

        return new int[]{duplicate, missing};
    }

    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
    }
}
