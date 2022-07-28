package Assignment;

public class PatternLogic {
	public static void asThree(int n, int i) {
		for (int j = 0; j < n; j++) {
			if(i==0||j==0 || j==n-1 ||i==n-1||i+j<=(n-1)/2||j-i>=(n-1)/2)
			System.out.print("* ");				
			else
				System.out.print("  ");
		}
		System.out.print(" ");
		
	}
	public static void asFour(int n, int i) {
		for (int j = 0; j < n; j++) {
			if(j==0&&j==(n-1)/2 || j==n-1&& j==(n-1)/2  ||i==n-1||i-j>=(n-1)/2||j+i>=(n-1)+(n-1)/2)
			System.out.print("* ");				
			else
				System.out.print("  ");
		}
		System.out.print(" ");
		
	} 
	public static void asFive(int n, int i) {
		for (int j = 0; j < n; j++) {
			if(i==0||i==n-1||j==0||i+j<=(n-1)/2||i-j>=(n-1)/2)
			System.out.print("* ");				
			else
				System.out.print("  ");
		}
		System.out.print(" ");
		
	}
}
