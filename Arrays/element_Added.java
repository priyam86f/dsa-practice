public class element_Added {
    public static void main(String[] args) {
        int[] nums1 = {2,6,4};
        int[] nums2 = {9,7,5};
        int res = addedInteger(nums1, nums2);
        System.out.println(res);
    }


    public static int addedInteger(int[] nums1, int[] nums2) {
        //max of nums2 - max of nums 1 is the result

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i=0;i<nums1.length;i++){
            if(nums1[i]>max1){
                max1=nums1[i];
            }
        }

        for(int i=0;i<nums2.length;i++){
            if(nums2[i]>max2){
                max2=nums2[i];
            }
        }

        return max2-max1;

    }
}
