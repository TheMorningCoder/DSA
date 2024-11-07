package striver_sheet.arrays;

public class SetMatrixZero2 {
	static int[][] matrix = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 0, 1, 5}
        };
	static int numberOfRows=matrix.length;
	static int numberOfCols=matrix[0].length;
	public static void main(String[]args) {
		printMatrix(matrix);
		setMatrix(matrix);
		System.out.println("After changing matrix:");
		printMatrix(matrix);
		
	}
	public static void setMatrix(int [][]matrix) {
		setMatrixMinusOne(matrix);
		convertMinusOneToZero(matrix);
	}
	public static void setMatrixMinusOne(int [][] matrix) {
			
		for(int i=0;i<numberOfRows;i++) {
			for(int j=0;j<numberOfCols;j++) {
				if(matrix[i][j]==0) {
					setRow(i,-1);
					setCol(j,-1);
				}
				
			}
		}
	}
	public static void convertMinusOneToZero(int [][] matrix) {
		for(int i=0;i<numberOfRows;i++) {
			for(int j=0;j<numberOfCols;j++) {
				if(matrix[i][j]==-1) {
					matrix[i][j]=0;
				}
				
			}
		}
	}
	
	public static void setRow(int row,int number) {
		for(int j=0;j<numberOfCols;j++) {
			if(matrix[row][j]!=0)
				matrix[row][j]=number;
		}
	}
	public static void setCol(int col,int number) {
		for(int i=0;i<numberOfRows;i++) {
			if(matrix[i][col]!=0)
				matrix[i][col]=number;
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
