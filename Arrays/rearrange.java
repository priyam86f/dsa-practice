public class rearrange {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] res = rearrange_array_elements_by_Sign(nums);
        printArray(res);
    }

    public static int[] rearrange_array_elements_by_Sign(int[] nums){
        int i=0;
        int j=1;
  
        int sol[] = new int[nums.length];
  
        for(int m=0;m<nums.length;m++){
          if(nums[m]>0){
              sol[i] = nums[m];
              i+=2;
          }else{
              sol[j] = nums[m];
              j+=2;
          }
        }
        return sol;
    }
    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
    }
}
