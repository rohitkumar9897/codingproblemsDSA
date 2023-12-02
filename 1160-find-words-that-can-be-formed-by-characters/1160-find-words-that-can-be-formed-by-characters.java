class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> hm= new HashMap<>();
        int ans=0;
        for(int i=0; i<chars.length(); i++){
            hm.put(chars.charAt(i), hm.getOrDefault(chars.charAt(i),0)+1);
        }
        for(String s: words){
            HashMap<Character, Integer> hm2= new HashMap<>(hm);
            for(int j=0; j<s.length(); j++){
                if(!hm2.containsKey(s.charAt(j))||hm2.get(s.charAt(j))==0){
                    break;
                }else{
                    hm2.put(s.charAt(j), hm2.get(s.charAt(j))-1);
                }
                if(hm2.get(s.charAt(j))==0){
                    hm2.remove(s.charAt(j));
                }
                if(j==s.length()-1){
                    ans+= s.length();
                }
            }
        }
        return ans;
    }
}