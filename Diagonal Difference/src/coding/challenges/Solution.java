package coding.challenges;

import java.util.Scanner;

public class Solution {
	Integer firstDiagonal;
	Integer secondDiagonal;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		Solution solution = new Solution();
		
		int a[][] = solution.populateArray(in, n);
		
		solution.sumDiagonals(n, a);
		
		System.out.println(String.format("%d", solution.computeDifference()));
		
		in.close();
	}

	public Solution() {
		firstDiagonal = new Integer(0);
		secondDiagonal = new Integer(0);
	}
	
	public int[][] populateArray(Scanner in, int n) {
		int a[][] = new int[n][n];

		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
			}
		}
		return a;
	}

	public void sumDiagonals(int n, int a[][]) {
		
		for (int i = 0, j = n - 1; i < n; i++, j--) {
			firstDiagonal += a[i][i];
			secondDiagonal += a[i][j];
		}
	}

	public int computeDifference() {
		return Math.abs(firstDiagonal - secondDiagonal);
	}
}
