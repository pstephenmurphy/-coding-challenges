
public class Solution {

	boolean checkBST(Node root) {
		return traversAndCheck(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	boolean traversAndCheck(Node node, int minValue, int maxValue) {
		boolean result;
		
		if (node == null)
			result = true;
		else if (node.data <= minValue || node.data >= maxValue)
			result = false;
		else
			result = traversAndCheck(node.left, minValue, node.data) 
				&& traversAndCheck(node.right, node.data, maxValue);

		return result;
	}
}

class Node {
	Node left;
	Node right;
	int data;
}