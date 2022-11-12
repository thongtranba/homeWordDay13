package homeWorkDay13;

public class SquareInteger {
	public static void main(String[] args) {
		System.out.println("square integer: " + findSquareInteger(17, 49));

	}
	public static int findSquareInteger(int a, int b) { // time complexity => O(n)
		int count = 0;
		int sum = 0;
		for (int i = 1; i < b; i = i + 2) { // n steps
			sum = sum + i;
			if (sum >= a && sum <= b) {
				count++;
			}
		}
		return count;
	}
}
