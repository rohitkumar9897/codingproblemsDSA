class Solution {
    public static int beauty(int freq[]){
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for(int i: freq){
            if(i!=0){
                min= Math.min(min, i);
                max= Math.max(max,i);
            }
        }
        return max-min;
    }

    public int beautySum(String s) {
        int ans=0;
        int n=s.length();
        for(int i=3; i<=n; i++){
            int j=0;
            int k=i;
            int freq[]= new int[26];
            for(int t=j; t<k; t++){
                freq[s.charAt(t)-'a']++;
            }
            ans+= beauty(freq);
            while(k<n){
                freq[s.charAt(k)-'a']++;
                freq[s.charAt(j)-'a']--;
                ans+=beauty(freq);
                k++;
                j++;
            }
        }
        return ans;
    }
}