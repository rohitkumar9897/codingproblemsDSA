class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap <Character, Integer> hm= new HashMap<>();
        for(char x: s.toCharArray()){
            hm.put(x, hm.getOrDefault(x,0)+1);
        }
        for(char x: t.toCharArray()){
            hm.put(x, hm.getOrDefault(x,0)-1);
        }

        for(int v: hm.values()){
            if(v!=0){
                return false;
            }
        }
        return true;
    }
}