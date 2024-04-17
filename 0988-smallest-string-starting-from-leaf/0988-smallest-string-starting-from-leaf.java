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
    String result="";
    
    public void dfs(TreeNode root, String curr){
        if(root==null){
            return;
        }
        curr= (char)(root.val+'a')+ curr;

        if(root.left==null && root.right==null){
            if(result==""|| result.compareTo(curr) > 0){
                result=curr;
            }
            return;
        }
        
        dfs(root.left, curr);
        dfs(root.right, curr);

    }

    public String smallestFromLeaf(TreeNode root) {
        
        dfs(root, "");
        return result;
    }
}