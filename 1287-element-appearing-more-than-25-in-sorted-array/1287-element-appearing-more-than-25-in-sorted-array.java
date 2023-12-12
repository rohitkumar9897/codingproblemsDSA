class Solution {
    public int findSpecialInteger(int[] arr) {
        int count=1;
        int n=arr.length;
        if(n==1){
            return arr[0];
        }
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]){
                count++;
            }else{
                count=1;
            }
            if(count>n/4){
                return arr[i];
            }
        }
        return -1;

    }
}