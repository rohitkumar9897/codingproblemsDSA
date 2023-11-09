class Solution {
    public int romanToInt(String s) {
        int sum=0;
        HashMap<Character, Integer> hm= new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int p = hm.get(s.charAt(0));
        sum+= p;
        for(int i=1; i<s.length(); i++){
            if(p<hm.get(s.charAt(i))){
                    sum+= hm.get(s.charAt(i))-2*p;
            }else{
                sum+= hm.get(s.charAt(i));
            }
            p=hm.get(s.charAt(i));
        }
        return sum;
    }
}