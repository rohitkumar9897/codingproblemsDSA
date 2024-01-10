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
    public int findTime(HashMap<TreeNode, TreeNode> hm, TreeNode target){
        Queue<TreeNode> q= new LinkedList<>();
        q.add(target);
        HashMap<TreeNode, Integer> vis= new HashMap<>();
        vis.put(target,1);
        int ans=0;
        while(!q.isEmpty()){
            int n= q.size();
            int flag=0;
            for(int i=0; i<n; i++){
                TreeNode curr= q.remove();
                if(curr.left!=null&& !vis.containsKey(curr.left)){
                    flag=1;
                    vis.put(curr.left,1);
                    q.add(curr.left);
                }
                if(curr.right!=null&& !vis.containsKey(curr.right)){
                    flag=1;
                    vis.put(curr.right, 1);
                    q.add(curr.right);
                }
                if(hm.containsKey(curr)&& !vis.containsKey(hm.get(curr))){
                    flag=1;
                    vis.put(hm.get(curr),1);
                    q.add(hm.get(curr));
                }
            }
            if(flag==1){
                ans++;
            }
        }
        return ans;
    }

    public TreeNode dfsTraversal(TreeNode root, HashMap<TreeNode, TreeNode> hm, int start){
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        TreeNode res=root;
        while(!q.isEmpty()){
            TreeNode curr= q.remove();
            if(curr.val==start){
                res=curr;
            }
            if(curr.left!=null){
                hm.put(curr.left, curr);
                q.add(curr.left);
            }
            if(curr.right!=null){
                hm.put(curr.right, curr);
                q.add(curr.right);
            }
        }
        return res;
    }

    public int amountOfTime(TreeNode root, int start) {
        HashMap<TreeNode, TreeNode> hm= new HashMap<>();
        TreeNode target= dfsTraversal(root, hm, start);
        return findTime(hm, target);
    }
}