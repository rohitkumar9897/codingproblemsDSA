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
    public int findRange(TreeNode root, int low, int high, int ans){
        if(root==null){
            return ans;
        }
        if(root.val>low&&root.val<high){
            ans+=root.val;
        }
        ans=findRange(root.left, low, high, ans);
        ans=findRange(root.right, low, high, ans);
        return ans;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        int ans=low+high;
        ans=findRange(root, low, high, ans);
        return ans;
    }
}