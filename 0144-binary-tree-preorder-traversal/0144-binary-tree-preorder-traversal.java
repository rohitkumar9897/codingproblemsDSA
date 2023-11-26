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
    public void preorder(TreeNode root, ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        arr.add(root.val);
        preorder(root.left,arr);
        preorder(root.right,arr);
        return;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arr= new ArrayList<>();
        if(root==null){
            return arr;
        }
        preorder(root,arr);
        return arr;

    }
}