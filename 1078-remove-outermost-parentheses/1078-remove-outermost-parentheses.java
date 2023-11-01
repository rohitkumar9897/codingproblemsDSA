class Solution {
    public String removeOuterParentheses(String s) {
        String k="";
        int count=0;
        int j=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                count++;
            }else if(s.charAt(i)==')'){
                count--;
            }

            if(count==0){
                k=k+ s.substring(j+1,i);
                j=i+1;
            }
        }
        return k;
    }
}