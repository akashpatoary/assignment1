package Assignment;

public class Launch {
	public static void main(String[] args) {
		// initialize n value
		int n = 7;

		// Question 1 INEURON
		for (int i = 0; i < n; i++) {
			Alphabets.i(n, i);
			Alphabets.n(n, i);
			Alphabets.e(n, i);
			Alphabets.u(n, i);
			Alphabets.r(n, i);
			Alphabets.o(n, i);
			Alphabets.n(n, i);
			System.out.println();
		}
		// Question 2
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		// Question 3,4,5
		for (int i = 0; i < n; i++) {
			PatternLogic.asThree(n, i);
			PatternLogic.asFour(n, i);
			PatternLogic.asFive(n, i);
			System.out.println();
		}
	}
}
