class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n= img.length;
        int m= img[0].length;
        int arr[][]= new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int sum = 0;
            int count = 0;
                for(int t=Math.max(0, i-1); t<Math.min(n,i+2); t++){
                    for(int k=Math.max(0, j-1); k<Math.min(m,j+2); k++){
                        sum =  sum + img[t][k];
                        count++;
                    }
                }
                arr[i][j]= Math.round(sum/count);
            }
            
        }
        return arr;
    }
}