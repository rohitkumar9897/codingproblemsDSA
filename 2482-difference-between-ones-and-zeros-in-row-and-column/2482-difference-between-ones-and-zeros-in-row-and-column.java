class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int onesRow[]= new int[n];
        int onesColumn[]= new int[m];
        int zerosRow[]= new int[n];
        int zerosColumn[]= new int[m];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    onesRow[i]++;
                    onesColumn[j]++;
                }else{
                    zerosRow[i]++;
                    zerosColumn[j]++;
                }
            }
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                grid[i][j]=onesRow[i]+onesColumn[j]-zerosRow[i]-zerosColumn[j];
            }
        }
        return grid;
    }
}