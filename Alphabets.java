package Assignment;

public class Alphabets {

	public static void e(int n, int i) {
		for (int j = 0; j < n; j++) {
			if (j == 0 || i == 0 || i == n - 1 || i == (n - 1) / 2 && j != n - 1)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.print(" ");
	}

	public static void i(int n, int i) {
		for (int j = 0; j < n; j++) {
			if (i == 0 || i == n - 1 || j == (n - 1) / 2)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.print(" ");
	}

	public static void n(int n, int i) {
		for (int j = 0; j < n; j++) {
			if (j == n - 1 || j == 0 || i - j == 0)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.print(" ");
	}

	public static void o(int n, int i) {
		for (int j = 0; j < n; j++) {
			if (i == 0 && (j >= (n - 1) / 4) && (j <= (n - 1) - (n - 1) / 4)
					|| i == n - 1 && (j >= (n - 1) / 4) && (j <= (n - 1) - (n - 1) / 4) || j == (n - 1) / 4
					|| j == (n - 1) - (n - 1) / 4)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.print(" ");
	}

	public static void u(int n, int i) {
		for (int j = 0; j < n; j++) {
			if (j == (n - 1) / 4 || j == (n - 1) - (n - 1) / 4
					|| i == n - 1 && (j >= (n - 1) / 4) && (j <= (n - 1) - (n - 1) / 4))
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.print(" ");

	}

	public static void r(int n, int i) {
		for (int j = 0; j < n; j++) {
			if (i == 0 && j <= (n - 1) / 2 || j == 0 || i == (n - 1) / 2 && j <= (n - 1) / 2 || i - j == (n - 1) / 2
					|| j == (n - 1) / 2 && i <= (n - 1) / 2)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.print(" ");

	}
}
