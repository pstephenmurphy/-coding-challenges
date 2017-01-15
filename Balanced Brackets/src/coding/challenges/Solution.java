package coding.challenges;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public boolean isBalanced(String expression) {
		Stack<Character> exprStack = new Stack<Character>();
		char[] exprArray = expression.toCharArray();

		for (Character c : exprArray) {
			switch (c) {
			case '[':
				exprStack.push(']');
				break;
			case '(':
				exprStack.push(')');
				break;
			case '{':
				exprStack.push('}');
				break;
			default:
				if (exprStack.isEmpty() || c != exprStack.pop())
					return false;
			}
		}
		return exprStack.isEmpty();

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Solution solution = new Solution();

		int t = in.nextInt();

		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();

			System.out.println(solution.isBalanced(expression) ? "YES" : "NO");
		}
		in.close();
	}
}
