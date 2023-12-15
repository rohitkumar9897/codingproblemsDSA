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
    static int maxPathsum(TreeNode root, int[] max){
        if(root==null){
            return 0;
        }
        int lv=maxPathsum(root.left, max);
        int rv=maxPathsum(root.right, max);
        int currentMax = Math.max(Math.max(lv + root.val, rv + root.val), root.val);
        max[0] = Math.max(max[0], Math.max(currentMax, lv + rv + root.val));
        return currentMax;
    }

    public int maxPathSum(TreeNode root) {
        int max[]={Integer.MIN_VALUE};
        maxPathsum(root, max);
        return max[0];
    }
}