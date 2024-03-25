class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr= new ArrayList<>();
        boolean bool[]= new boolean[nums.length+1];
        for(int i=0; i<nums.length; i++){
            if(bool[nums[i]]){
                arr.add(nums[i]);
            }else{
                bool[nums[i]]=true;
            }
        }
        return arr;
    }
}