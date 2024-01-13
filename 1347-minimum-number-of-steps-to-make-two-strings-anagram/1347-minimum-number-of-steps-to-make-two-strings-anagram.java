class Solution {
    public int minSteps(String s, String t) {
        if(s.length()==0){
            return 0;
        }
        int ans=0;
        int n=s.length();
        HashMap<Character, Integer> map1=new HashMap<>();
        HashMap<Character, Integer> map2=new HashMap<>();
        for(int i=0; i<n; i++){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0)+1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i),0)+1);
        }
        for(int i=0; i<n; i++){
            if(map2.containsKey(s.charAt(i))){
                int x=map1.get(s.charAt(i));
                int y=map2.get(s.charAt(i));
                if(y>=x){
                    map1.put(s.charAt(i),0);
                    map2.put(s.charAt(i),0);
                }else{
                    ans+= x-y;
                    map1.put(s.charAt(i), 0);  // Update the frequency in map1
                    map2.put(s.charAt(i), 0);
                }
            }else{
                ans+=map1.get(s.charAt(i));
                map1.put(s.charAt(i),0);
            }
        }
        return ans;
    }
}