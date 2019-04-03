package coding.challenges;

import java.util.Vector;

public class Solution {
	
	private Vector<Vector<Character>> matrix;
	private int size;
	
	public Solution(int size) {
		this.size = size;
		this.matrix = new Vector<Vector<Character>>(this.size);
		
	    initMatrix();
	}

	public int size() {
		return this.size;
	}
	
	public void solveMatrix() {
		
		for (int i = 0; i < this.size; ++i) {
			
			Vector<Character> row = this.matrix.get(i);
			
			for (int j = 0; j < this.size; ++j) {
				
				row.add(j, getMatrixValue(i, j));
			}
		}
	}

	public void printMatrix() {
		
		for (int i = 0; i < this.size; ++i) {
			
			for (int j = 0; j < this.size; ++j) {
				
				System.out.print(this.matrix.get(i).get(j));
			}
			
			System.out.println();				
		}
		
		System.out.println();				
	}
	
	private void initMatrix() {
		
		for (int i = 0; i < this.size; i++) {
	    	
	        Vector<Character> v = new Vector<>(this.size);
	        
	        for(int j = 0; j < this.size; j++) {
	        	
	            v.add(Character.valueOf(' '));
	        }
	        
	        matrix.add(v);
	    }
	}

	private Character getMatrixValue(int i, int j) {
		if ((j - i) == 0) {
			return Character.valueOf('X');
		} else if ((j == (size() - 1) - i)) {
			return Character.valueOf('X');
		} else {
			return Character.valueOf('O');
		}
	}
	
	public static void main(String[] args) {
				
		int size = Integer.valueOf(args[0]);
		
		if (isOdd(size)) {
			Solution solution = new Solution(size);
			
			solution.solveMatrix();
			
			solution.printMatrix();
		} else {
			
			System.out.printf("Argument %d isn't odd\n", size);	
		}
	}
	
	private static boolean isOdd(int x) {
		return (x % 2 != 0);
	}
}
