public class transpose{
    public static void main(String[] args) {
        int[][] og_matrix = new int[3][3];
        int count=1;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                og_matrix[i][j]=count;
                count++;
            }
        }

        int check=0;
        int[][] transpose = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               transpose[j][i] = og_matrix[i][j];
              
            }
        }

        printMatrix(transpose);
        

    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    
}
}

