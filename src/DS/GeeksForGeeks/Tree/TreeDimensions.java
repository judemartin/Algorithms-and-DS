package DS.GeeksForGeeks.Tree;

import DS.Leetcode.Solutions.Easy.maxDepthBinaryTree;

public class TreeDimensions {

	public static int size(TreeNode root) {
		// Count the number
		if (root == null) {
			return 0;
		}
		return size(root.left) + 1 + size(root.right);
	}

	public void deleteTree(TreeNode root) {
	}

	public static int maxDepthOrHeight(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftDepth = maxDepthOrHeight(root.left);
		int rightDepth = maxDepthOrHeight(root.right);

		return Math.max(leftDepth, rightDepth) + 1;
	}

	public static int countLeaves(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		return countLeaves(root.right) + countLeaves(root.left);
	}

	public int diameter(TreeNode root) {
		return 0;
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		System.out.println("The size of the Binary Tree is: " + size(root));
		System.out.println("The Max Depth of height of the Binary Tree is: "
				+ maxDepthOrHeight(root));
		System.out.println("The number of leaves of the Binary Tree is: "
				+ countLeaves(root));
	}
}
