class Solution {
    int countWays(int n, int[] dp){
        if(n==1||n==2){
            dp[n]=n;
            return dp[n];
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]= countWays(n-1, dp)+countWays(n-2, dp);
        return dp[n];
    }

    public int climbStairs(int n) {
        int dp[]= new int[n+1];
        dp[n]=countWays(n, dp);
        return dp[n];
    }
}