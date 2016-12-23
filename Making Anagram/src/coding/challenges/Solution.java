package coding.challenges;

import java.io.IOException;
import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) throws IOException {
        
    	 Scanner in = new Scanner(System.in);
    	  String str1 = in.next();
    	  String str2 = in.next();
    	  in.close();

    	  char[] first = str1.toCharArray();
    	  char[] second = str2.toCharArray();
       
        Solution solution = new Solution();
        
        System.out.println(solution.numberOfCharsToDeleted(first, second));
    }

	public Solution() {
	}

    public int numberOfCharsToDeleted(char[] first, char[] second) {

        int[] countOfCharChanges = new int['z' - 'a' + 1];
        
        countOfChangesAdded(first, countOfCharChanges);
        
        countOfChangesRemoved(second, countOfCharChanges);
        
        int numberOfCharsToDeleted = numberOfCharsToDeleted(countOfCharChanges);
 
        return numberOfCharsToDeleted;
    }

	private int numberOfCharsToDeleted(int[] countOfCharChanges) {
		int numberOfCharsToDeleted = 0;
        for(int cnt : countOfCharChanges){
        	numberOfCharsToDeleted += (cnt < 0) ? -cnt : cnt;
        }
		return numberOfCharsToDeleted;
	}

	private void countOfChangesRemoved(char[] sArray, int[] countOfCharChanges) {
		for(char c : sArray){
            countOfCharChanges[c - 'a']--;
        }
	}

	private void countOfChangesAdded(char[] sArray, int[] countOfCharChanges) {
		for(char c : sArray){
            countOfCharChanges[c - 'a']++;
        }
	}
}

