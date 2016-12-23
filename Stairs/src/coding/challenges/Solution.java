package coding.challenges;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

		Solution solution = new Solution();
		
		solution.StairCase(n);
		
		in.close();
	}

	public void StairCase(int n) {

		for (int i = 1; i <= n; i++) {
			printSpace(i, n);
			printStair(i, n);
		}
	}

	private void printSpace(int i, int n) {
		for (int j = 0; j < (n - i); j++) {
			System.out.print(" ");
		}
	}

	private void printStair(int i, int n) {
		for (int j = 0; j < i; j++) {
			System.out.print("#");
		}

		System.out.println();
	}
}
