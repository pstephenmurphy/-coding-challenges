package coding.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	private List<Integer> seqList;

	private Integer lastAnswer;

	private Integer sequences;
	private Integer queries;

	public Solution(int sequences, int queries) {
		this.sequences = sequences;
		this.queries = queries;
		this.seqList = new ArrayList<Integer>(this.sequences);
	}

	public int sequences() {
		return this.sequences;
	}

	public int queries() {
		return this.queries;
	}

	public Integer getLastAnswer() {
		return lastAnswer;
	}

	public void setLastAnswer(Integer lastAnswer) {
		this.lastAnswer = lastAnswer;
	}

	public void add(int value) {
		this.seqList.add(value);
	}

	public Integer get(int i) {
		return this.seqList.get(i);
	}

	public void setSequence(int x, int y) {
		int seq = (x ^ lastAnswer) % sequences;
		seqList.add(seq, y);
	}

	public void findSequence(int x, int y) {
		int seq = (x ^ lastAnswer) % sequences;
		lastAnswer = seqList.get(y) % sequences;
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Solution solution = new Solution(scanner.nextInt(), scanner.nextInt());

		int x;
		int y;

		for (int i = 0; i < solution.queries(); i++) {
			switch (scanner.nextInt()) {
			case 1:
				x = scanner.nextInt();
				y = scanner.nextInt();

				solution.setSequence(x, y);

				break;
			case 2:
				x = scanner.nextInt();
				y = scanner.nextInt();

				break;
			}
		}

		for (int i = solution.queries() - 1; i >= 0; i--) {
			System.out.print(solution.get(i));
			System.out.print(" ");
		}

		System.out.println();

		scanner.close();
	}
}