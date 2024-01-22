class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[]= new int[2];
        boolean vis[]= new boolean[nums.length];
        for(int i=0; i<nums.length; i++){
            if(!vis[nums[i]-1]){
                vis[nums[i]-1]=true;
            }else{
                ans[0]=nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(vis[i]!=true){
                ans[1]=i+1;
                break;
            }
        }
        return ans;
    }
}