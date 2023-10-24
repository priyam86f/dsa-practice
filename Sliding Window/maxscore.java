public class maxscore {
    public static void main(String[] args) {
        int[] nums = {5,5,4,5,4,1,1,1};
        int soln = max_Score_of_A_good_subarray(nums, 0);
        System.out.println(soln); 
    }

    public static int max_Score_of_A_good_subarray(int[] nums,int k){
        int left_pointer = k;
        int right_pointer=  k;
        int res = nums[k];
        int currmin = nums[k];

        

        while(left_pointer>0 || right_pointer<nums.length ){
            int left =  left_pointer>0 ? nums[left_pointer-1] : 0;
            int right = right_pointer<nums.length -1 ? nums[right_pointer+1] : 0;

            if(left>right){
              left_pointer--;
              currmin = Math.min(currmin, left);
            }else{
                right_pointer++;
                currmin=Math.min(currmin, right);
            }
            res = Math.max(res, currmin*(right_pointer-left_pointer+1));

        }
       
        return res;
       
    }
}
