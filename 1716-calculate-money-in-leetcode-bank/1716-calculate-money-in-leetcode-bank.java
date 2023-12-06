class Solution {
    public int totalMoney(int n) {
        int t=n/7;
        int l= 28+ (t-1)*7;
        int ans=(t)*(28+l)/2;
        int x=n%7;
        while(x!=0){
            t=t+1;
            ans+=t;
            x--;
        }
        return ans;
    }
}