public class specialarrayI {
    public static void main(String[] args) {
        int nums[] = {6,1,2};
        boolean res = isArraySpecial(nums);
        System.out.println(res);
    }

    public static boolean isArraySpecial(int[] nums) {
        /*
         * if we add two odd elements, result is always even
         * if we add one odd and one even element, result is always odd
         */
        if (nums.length == 1) {
            return true;
        }
        boolean res = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] + nums[i + 1]) % 2 == 0) {
                res = false;
                break;
            }
        }
        return res;
    }
}
