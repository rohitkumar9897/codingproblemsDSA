class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        int leftHalf = 0;
        int rightHalf = sum;

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            rightHalf -= n;

            result[i] = n * i - leftHalf + rightHalf - n * (nums.length - i - 1);

            leftHalf += n;
        }

        return result;
    }
}