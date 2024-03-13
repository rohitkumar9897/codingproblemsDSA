class Solution {
    public int sum(int n){
        int ans=0;
        for(int i=1; i<=n; i++){
            ans=ans+i;
        }
        return ans;
    }

    public int pivotInteger(int n) {
        int total= sum(n);
        for(int i=0; i<=n; i++){
            if(sum(i)== total-sum(i)+i){
                return i;
            }
        }
        return -1;
    }
}