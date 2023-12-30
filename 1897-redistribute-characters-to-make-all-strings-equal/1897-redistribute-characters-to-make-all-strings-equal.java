class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character, Integer> hm= new HashMap<>();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                hm.put(words[i].charAt(j), hm.getOrDefault(words[i].charAt(j),0)+1);
            }
        }
        int n=words.length;
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                if(hm.get(words[i].charAt(j))%n!=0){
                    return false;
                }
            }
        }
        return true;
    }
}