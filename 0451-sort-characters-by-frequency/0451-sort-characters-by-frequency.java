class Solution {
    public String frequencySort(String s) {
        HashMap <Character, Integer> hm= new HashMap<>();
        for(int i=0; i<s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> {
    if (hm.get(a).equals(hm.get(b))) {
        // If frequencies are equal, compare characters
        return a.compareTo(b);
    }
    // Otherwise, sort by frequency in descending order
    return hm.get(b) - hm.get(a);
});
        for(int i=0; i<s.length(); i++){
            pq.add(s.charAt(i));
        }
        String str="";
        while(!pq.isEmpty()){
            char ch= pq.remove();
            str=str+ch;
        }
        return str;
        
    }
}