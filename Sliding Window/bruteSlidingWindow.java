/*Given an Array of size n, find the maximum sum subarray of size K and return the max sum. */
public class bruteSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {2,3,5,2,9,7,1};
        int res = MAXSLIDINGWINDOW(nums, 3);
        System.out.println(res);
    }


    public static int MAXSLIDINGWINDOW(int[] nums, int K){
        int sum = 0;
        int sum_values[] = new int[nums.length];

        for(int i=0;i<=nums.length-K;i++){
            sum=0;
            for(int j=i;j<i+K;j++){
                sum=sum+nums[j];
            }
            sum_values[i] = sum;
        }

        //find the max sum from sum_values[i].

        int max = sum_values[0];
        for(int i=0;i<sum_values.length;i++){
            if(sum_values[i]>max){
                max=sum_values[i];
            }
        }
        return max;
    }
}
