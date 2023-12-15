class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, Integer> hm= new HashMap<>();
        for(int i=0; i<paths.size(); i++){
            hm.put(paths.get(i).get(0), 1);
        }
        for(int i=0; i<paths.size(); i++){
            if(!hm.containsKey(paths.get(i).get(1))){
                return paths.get(i).get(1);
            }
        }
        return "";
    }
}