class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        if(nums.length==0){
            return arr;
        }else if(nums.length==1){
            List<Integer> arr2= new ArrayList<>();
            arr2.add(nums[0]);
            arr.add(arr2);
            return arr;
        }
        boolean vis[]= new boolean[nums.length];
        for(int i=0; i<vis.length; i++){
            vis[i]= true;
        }
        int count=0;
        while(count<nums.length){
            HashSet<Integer> hs= new HashSet<>();
            List<Integer> arr2= new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                if(!hs.contains(nums[i])&& vis[i]){
                    arr2.add(nums[i]);
                    vis[i]= false;
                    hs.add(nums[i]);
                    count++;
                }
            }
            arr.add(arr2);
        }
        return arr;
    }
}