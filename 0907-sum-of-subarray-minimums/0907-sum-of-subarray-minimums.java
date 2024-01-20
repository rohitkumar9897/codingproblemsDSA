class Solution {
    public int sumSubarrayMins(int[] arr) {
        int sum=0;
        for(int i=0; i<arr.length; i++){
            int min=arr[i];
            for(int k=i; k<arr.length; k++){
                if(min>arr[k]){
                    min=arr[k];
                }
                sum+=min;
            }
            sum= sum%((int)Math.pow(10,9)+7);
        }
        return sum;
    }
}