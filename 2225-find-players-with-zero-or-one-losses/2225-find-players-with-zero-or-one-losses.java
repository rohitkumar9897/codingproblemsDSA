class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> arr= new ArrayList<>();
        List<Integer> arr1= new ArrayList<>();
        List<Integer> arr2= new ArrayList<>(); 
        HashMap<Integer, Integer> hm= new HashMap<>();
        for(int i=0; i<matches.length; i++){
            hm.put(matches[i][0],hm.getOrDefault(matches[i][0],0));
            hm.put(matches[i][1], hm.getOrDefault(matches[i][1],0)+1);
        }
        for(int x: hm.keySet()){
            if(hm.get(x)==0){
                arr1.add(x);
            }else if(hm.get(x)==1){
                arr2.add(x);
            }
        }
        arr1.sort(null);
        arr2.sort(null);
        arr.add(arr1);
        arr.add(arr2);
        return arr;
    }
}