class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> hm= new HashMap<>();
        int max=-1;
        for(int i=0; i<s.length(); i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), i);
            }else{
                int len= i-hm.get(s.charAt(i))-1;
                max= Math.max(max, len);
            }
        }
        return max;
    }
}