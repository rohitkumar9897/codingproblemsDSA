class Solution {
    public boolean isPalindrome(int x) {
        int k = x;
        int z=0;
        while(x>0){
            int t= x%10;
            z= z*10+t;
            x=x/10;
        }
        if(k==z){
           return true;
        }else{
           return false;
        }
    }
}