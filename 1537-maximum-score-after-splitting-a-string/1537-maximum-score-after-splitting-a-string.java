class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int Z=0;
        int O=0;
        int max=0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='0'){
                Z++;
            }else{
                O++;
            }
        }
        int lz=0;
        int lo=0;
        for(int i=0; i<n-1; i++){
            if(s.charAt(i)=='0'){
                lz++;
                Z--;
            }else{
                O--;
                lo++;
            }
            max=Math.max(max, lz+O);
        }
        return max;
    }
}