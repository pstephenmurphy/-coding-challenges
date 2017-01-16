package coding.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	private List<Integer> array;
	private int size;
	
	public Solution(int size) {
		this.size = size;
		this.array = new ArrayList<Integer>(this.size);
		
	}

	public int size() {
		return this.size;
	}

	public void add(int value) {
		this.array.add(value);
	}

	private Integer get(int i) {
		return this.array.get(i);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Solution solution = new Solution(scanner.nextInt());
		
		for (int i = 0; i < solution.size(); i++) {
			solution.add(scanner.nextInt());
		}
		
		for (int i = solution.size() - 1; i >= 0; i--) {
			System.out.print(solution.get(i));
			System.out.print(" ");
		}
		
		System.out.println();

		scanner.close();
	}
}
