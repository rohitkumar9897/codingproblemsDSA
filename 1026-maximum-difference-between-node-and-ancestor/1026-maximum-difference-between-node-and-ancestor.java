/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int maxDiff = -1;

    public int maxAncestorDiff(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = root.val;
        int min = root.val;
        traversal(root.left, max, min);
        traversal(root.right, max, min);
        return maxDiff;
    }

    private void traversal(TreeNode root, int max, int min) {
        if (root == null) {
            return;
        }
        if (root.val > max) {
            max = root.val;
        } else if (root.val < min) {
            min = root.val;
        }
        maxDiff = Math.max(maxDiff, Math.abs(max - min));
        traversal(root.left, max, min);
        traversal(root.right, max, min);
    }
}