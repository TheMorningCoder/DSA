package striver_sheet;
/*Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.*/

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };
        int row = matrix.length;
        int column = matrix[0].length;
        System.out.println("Input Matrix:");
        printMatrix(matrix);

        // First pass: Identify the rows and columns to be set to -1
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                if(matrix[i][j] == 0) {
                    setRowElementsMinusOne(i, matrix);
                    setColumnElementsMinusOne(j, matrix);
                }
            }
        }
        convertMinusOneToZero(matrix);
        System.out.println("Matrix After change:");
        printMatrix(matrix);
    }

    private static void convertMinusOneToZero(int[][]matrix) {
		for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j <matrix[0].length; j++) {
                if(matrix[i][j] == -1) {
                    matrix[i][j]=0;
                }
            }
        }
	}

	private static void setColumnElementsMinusOne(int index, int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][index] != 0) {  
                matrix[i][index] = -1;
            }
        }
    }

    private static void setRowElementsMinusOne(int i, int[][] matrix) {
        for(int j = 0; j < matrix[0].length; j++) {
            if(matrix[i][j] != 0) { 
                matrix[i][j] = -1;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
