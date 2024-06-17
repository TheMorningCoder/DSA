package recursion_with_strings;

public class TowerOfHanoi {
	public static void main(String args[]) {
		towerOfHanoi(3,'s','h','d');
	}
	public static void towerOfHanoi(int n,char s,char h,char d) {
		if(n==1)
			System.out.println("Move "+n+" st disk from "+s+" to "+d );
		else {
			towerOfHanoi(n-1,s,d,h);
			System.out.println("Move "+n+" th disk from "+s+" to "+d );
			towerOfHanoi(n-1,h,s,d);
		}
	}
}
