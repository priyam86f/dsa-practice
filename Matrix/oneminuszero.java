public class oneminuszero {
    public static void main(String[] args) {
        int[][] mat = {{0,1,1},{1,0,1},{0,0,1}};
        int[][] res = onesMinusZeros(mat);
        printMatrix(res);

    }

    public static int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] row0 = new int[m];
        int[] row1 = new int[m];
        int[] col0 = new int[n];
        int[] col1 = new int[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    row0[i]++;
                    col0[j]++;
                }else{
                    row1[i]++;
                    col1[j]++;
                }
            }
        }

        int[][] res = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j] = row1[i] + col1[j] - row0[i] - col0[j];
            }
        }
        return res;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  // Move to the next line after printing each row
        }
    }
}
