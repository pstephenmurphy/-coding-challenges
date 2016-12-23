package coding.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	Map<String, Integer> magazineMap = new HashMap<String, Integer>();
	Map<String, Integer> noteMap = new HashMap<String, Integer>();

	public Solution(String magazine, String note) {

		buildMap(magazine, magazineMap);
		buildMap(note, noteMap);
	}

	private boolean checkMatch(Map<String, Integer> magazineMap, Map<String, Integer> noteMap) {

		boolean result = false;

		for (String k : noteMap.keySet()) {

			Integer nCount = noteMap.get(k);

			if (null != nCount) {

				Integer mCount = magazineMap.get(k);

				if (mCount.compareTo(nCount) >= 0) {
					result = true;
				} else {
					result = false;
				}
			} else {
				result = false;
			}
			
			if (result == false) {
				break;
			}
		}

		return result;
	}

	private void buildMap(String magazine, Map<String, Integer> map) {

		String[] mString = magazine.split(" ");

		for (String s : mString) {

			Integer count = map.get(s);

			if (null != count) {
				map.put(s, ++count);
			} else {
				map.put(s, 1);
			}
		}
	}

	public boolean solve() {
		return checkMatch(magazineMap, noteMap);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		@SuppressWarnings("unused")
		int m = scanner.nextInt();
		
		@SuppressWarnings("unused")
		int n = scanner.nextInt();

		scanner.nextLine();

		Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
		scanner.close();

		boolean answer = s.solve();
		if (answer)
			System.out.println("Yes");
		else
			System.out.println("No");

		scanner.close();
	}
}
