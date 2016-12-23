package coding.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Solution solution = new Solution();

		solution.hasCycle(solution.getHead());

		in.close();
	}

	private Node getHead() {
		return new Node(0);
	}

	private boolean hasCycle(Node head) {
	    boolean result = true;
	    
	    if (null == head) {
	        result = false;
	    } else {
	    	visitNodes(head);
	    }
	    
	    return result;
	}

	private boolean visitNodes(Node head) {
	    List<Node> visited = new ArrayList<Node>();
	    
	    Node cursor = head;
	    boolean result = true;
	    
	    while (cursor != null && result == true) {
	        
	        if (visited.contains(cursor)) {
	            result = false;
	        } else {
	            visited.add(cursor);
	            cursor = cursor.next;
	        }
	    }
	    
	    return result;
	}

	public class Node {

		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
		}
	}
}
