class Solution {
    public int numberOfArithmeticSlices(int[] arr) {
        HashMap<Integer, Integer>[] hm= new HashMap[arr.length];
        int ans=0;
        for(int i=0; i<arr.length; i++){
            hm[i]= new HashMap<>();
        }
        for(int i=0; i<hm.length; i++){
            for(int j=0; j<i; j++){
                long cd= (long)arr[i]-(long)arr[j];
                if(cd>=Integer.MAX_VALUE||cd<=Integer.MIN_VALUE){
                    continue;
                }
                int apEndingAtj= hm[j].getOrDefault((int)cd,0);
                int apEndingAti=hm[i].getOrDefault((int)cd,0);
                ans+= apEndingAtj;
                hm[i].put((int)cd, apEndingAti+apEndingAtj+1);
            }
        }
        return ans;
    }
}