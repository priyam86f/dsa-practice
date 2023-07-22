//Iterative Merge Sort algorithm by Abdul Bari.
public class iterativeMergeSort{
    public static void main(String[] args) {
        int[] array1 = {2,8,15,18,22,24};
        int[] array2 = {5,9,12,17};

        int[] result = mergeSort(array1, array2, array1.length, array2.length);

        printArray(result);
    }

    public static int[] mergeSort(int[] A,int[] B,int m, int n){
        int i = 0;
        int j = 0;
        int k = 0;

        int[] C = new int[m+n]; 

        while(i<m && j<n){
            if(A[i]<B[j]){
                C[k++]=A[i++];
            }else{
                C[k++]=B[j++];
            }
        }

        for(;i<m;i++){
            C[k++]=A[i];
        }
        for(;j<n;j++){
            C[k++]=B[j];
        }

        return C;
    }

    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
    }
}