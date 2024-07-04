public class minoperations {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,4,2,5,9};
        int k = 9;
        int res = minOperations(nums, k);
        System.out.println(res);
    }

    public static int minOperations(int[] nums, int k) {
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                count++;
            }
        }
        return count;
    }
}
