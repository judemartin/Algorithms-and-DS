package Leetcode.Easy;

public class maxDepthBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int maxDepth(TreeNode root) {

		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		if (root.left == null && root.right != null)
			return 1 + maxDepth(root.right);
		if (root.right == null && root.left != null)
			return 1 + maxDepth(root.left);

		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

	}
}
