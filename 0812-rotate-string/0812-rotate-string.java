class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }else if(s.length()==0){
            return true;
        }
        int count=0;
        while(count<s.length()){
            if(s.equals(goal)){
                return true;
            }else{
                char i= s.charAt(0);
                s=s.substring(1,s.length())+i;
            }
            count++;

        }
        return false;
        
    }
}