/* count the max depth of a valid parentheses string i.e after how many braces the string will come.*/
class Solution {
    public int maxDepth(String s) {
        int max=0;
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                count++;
                max= Math.max(max, count);
            }else if(s.charAt(i)==')'){
                count--;
            }
        }
        return max;
    }
}