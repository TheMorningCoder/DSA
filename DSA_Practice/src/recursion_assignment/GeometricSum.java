/*
 
Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 

*/

package recursion_assignment;
import java.lang.Math;
public class GeometricSum {
	
	public static void main(String args[]) {
		int n=2;
		System.out.println(findGeometricSum(n));
	}
	
	public static double findGeometricSum(int k) {
		if(k==0) {
			return 1;
		}
			
		return findGeometricSum(k-1)+ 1/Math.pow(2, k);
			
	}
	
	
	
//	static double sum=0;
//	public static double geometricSum(int n) {
//				if(n==0)
//			return 0;
//		
//		else {
//			double calc=1/Math.pow(2, geometricSum(n-1));
//			sum=sum+calc;
//			return sum;
//		}
//			
//	}
}




