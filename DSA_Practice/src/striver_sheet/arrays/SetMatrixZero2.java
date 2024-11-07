package striver_sheet.arrays;

public class SetMatrixZero2 {
	static int[][] matrix = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 7, 1, 5}
        };
	static int numberOfRows=matrix.length;
	static int numberOfCols=matrix[0].length;
	
	public static void main(String[]args) {
		printMatrix(matrix);
		System.out.println();
		setMatrixZero();
		System.out.println("After changing matrix:");
		printMatrix(matrix);
		
	}
	
	public static void setMatrixZero() {
		int[] rowRecord=new int[numberOfRows];
		int[] colRecord =new int[numberOfCols];
		
		for(int i=0;i<numberOfRows;i++) {
			for(int j=0;j<numberOfCols;j++) {
				if(matrix[i][j]==0) {
					rowRecord[i]=-1;
					colRecord[j]=-1;
				}
			}
		}
		
		for(int i=0;i<numberOfRows;i++) {
			if(rowRecord[i]==-1) {
				for(int j=0;j<numberOfCols;j++) {
					matrix[i][j]=0;
				}
			}
		}
		for(int i=0;i<numberOfCols;i++) {
			if(colRecord[i]==-1) {
				for(int j=0;j<numberOfRows;j++) {
					matrix[j][i]=0;
				}
			}
		}
//		for(int i=0;i<numberOfRows;i++) {
//			System.out.print(rowRecord[i]+" ");
//			
//		}
//		System.out.println();
//		for(int i=0;i<numberOfCols;i++) {
//			System.out.print(colRecord[i]+" ");
//		}
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
