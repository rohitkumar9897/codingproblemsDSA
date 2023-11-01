class Solution {

    public static int maxIndex(int[][] mat, int mid){
        int index=0;
        int max=0;
        for(int i=0; i<mat.length; i++){
            if(mat[i][mid]>max){
                max=mat[i][mid];
                index=i;
            }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] mat) {
        int m= mat.length;
        int n= mat[0].length;
        int arr[]= new int[2];

        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            int idx= maxIndex(mat, mid);
            int left= mid-1>=0 ?mat[idx][mid-1]: -1;
            int right= mid+1<=n-1 ? mat[idx][mid+1]: -1;

            if(mat[idx][mid]>left && mat[idx][mid]>right){
                arr[0]=idx;
                arr[1]=mid;
                return arr;
            }else if(mat[idx][mid]<left){
                high= mid-1;
            }else if(mat[idx][mid]<right){
                low= mid+1;
            }

        }
        return arr;

        
    }
}