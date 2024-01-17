class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
        boolean ans[]= new boolean[n];
        Arrays.sort(arr);
        int count=1;
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]){
                count++;
            }else{
                if(ans[count]!=true){
                    ans[count]=true;
                    count=1;
                }else{
                    return false;
                }
            }
        }
        if(arr[n-2]!=arr[n-1]){
            if(ans[1]==true){
                return false;
            }
        }
        return true;
    }
}