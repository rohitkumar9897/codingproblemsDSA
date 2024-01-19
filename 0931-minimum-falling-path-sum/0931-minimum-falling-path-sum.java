class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min=Integer.MAX_VALUE;
        int n=matrix.length;
        int m=matrix[0].length;
        int dp[][]= new int[n][m];
        for(int j=0; j<m; j++){
            dp[0][j]=matrix[0][j];
        }
        for(int i=1; i<n; i++){
            for(int j=0; j<m; j++){
                int below= matrix[i][j]+ dp[i-1][j];
                int ld= Integer.MAX_VALUE;
                int rd= Integer.MAX_VALUE;
                if(j-1>=0){
                    ld= matrix[i][j]+ dp[i-1][j-1];
                }if(j+1<m){
                    rd=matrix[i][j]+ dp[i-1][j+1];
                }
                dp[i][j]= Math.min(below, Math.min(ld,rd));
            }
        }
        for(int j=0; j<m; j++){
            min= Math.min(min, dp[n-1][j]);
        }
        return min;
    }
}