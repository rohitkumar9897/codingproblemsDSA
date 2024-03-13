class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]= new int[nums.length];
        int flag=0;
        int x= 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                flag++;
            }else{
                x*=nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(flag==0){
                ans[i]= x/nums[i];
            }else if(flag==1&& nums[i]==0){
                ans[i]=x;
            }else{
                ans[i]=0;
            }
        }
        return ans;
    }
}