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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> arr= new ArrayList<>();
        if(root==null){
            return arr;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        boolean flag=true;
        while(!q.isEmpty()){
            int n= q.size();
            List<Integer> arr2= new ArrayList<>(n);
            for(int i=0; i<n; i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                if(flag){
                    arr2.add(q.poll().val);
                }else{
                    arr2.add(0,q.poll().val);
                }
            }
            flag=!flag;
            arr.add(arr2);
        }
        return arr;
    }
}