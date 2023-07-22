//Divide and Conquer
public class recursiveMergeSort {
    public static void main(String[] args) {
        int[] nums = {9,3,7,5,6,4,8,2};
        int n = nums.length;
        divide(nums, 0, n-1);
        for(int i=0;i<n ;i++ ){
            System.out.println(nums[i]+" ");
        }
    }


    public static void divide(int[] nums,int low, int high){ //recursive
         if(low>=high)
         return;

         
            int mid = low  + (high-low)/2;
            divide(nums, low, mid);
            divide(nums, mid+1, high);
            conquer(nums, low, mid, high);
         
    }


    public static void conquer(int[] nums, int low, int mid, int high){   
      int[] merge = new int[high-low+1];
      int ind1 = low;
      int ind2 = mid+1;
      int x = 0;

      //subarrays

      while(ind1<=mid && ind2<=high){
        if(nums[ind1]<nums[ind2]){
            merge[x++]=nums[ind1++];
        }
        else if(nums[ind1]>nums[ind2]){
            merge[x++]=nums[ind2++];
        }
    }

    for(;ind1<=mid;ind1++){
        merge[x++]=nums[ind1];

    }

    for(;ind2<=high;ind2++){
        merge[x++]=nums[ind2];

    }
    for(int i=0, j=low; i<merge.length; i++,j++){
        nums[j] = merge[i];
    }

}
}