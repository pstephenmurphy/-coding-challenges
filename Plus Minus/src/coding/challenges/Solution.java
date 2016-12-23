package coding.challenges;

import java.util.Scanner;

public class Solution {
	private Integer positive;
	private Integer negative;
	private Integer zero;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Solution solution = new Solution();

		int n = in.nextInt();

		int arr[] = solution.initArrary(in, n);

		solution.computeCounts(n, arr);
		
		System.out.println(String.format("%6f", solution.getPositive().doubleValue() / n));
		System.out.println(String.format("%6f", solution.getNegative().doubleValue() / n));
		System.out.println(String.format("%6f", solution.getZero().doubleValue() / n));
		
		in.close();
	}

	public Integer getPositive() {
		return positive;
	}

	public Integer getNegative() {
		return negative;
	}

	public Integer getZero() {
		return zero;
	}

	public Solution() {
		positive = new Integer(0);
		negative = new Integer(0);
		zero = new Integer(0);
	}

	public void computeCounts(int n, int[] arr) {

		for (int i = 0; i < n; i++) {
			if (arr[i] > 0)
				positive++;
			else if (arr[i] < 0)
				negative++;
			else
				zero++;
		}

	}

	public int[] initArrary(Scanner in, int n) {
		int arr[] = new int[n];

		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}

		return arr;
	}

}
