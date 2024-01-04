class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> hm= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(int cnt: hm.values()){
            if(cnt%3==0){
                ans+= cnt/3;
            }else{
                while(cnt%3!=0&&cnt>=0){
                    cnt=cnt-2;
                    ans++;
                }
                if(cnt<0){
                    return -1;
                }
                ans+=(cnt/3);
            }
        }
        return ans;
    }
}