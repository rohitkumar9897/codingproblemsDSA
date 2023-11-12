class Solution {

    static boolean palindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String str="";
        int max=0;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(palindrome(s.substring(i,j+1))){
                    if(max<(j-i+1)){
                        max= j-i+1;
                        str=s.substring(i,j+1);
                    }
                }
            }
        }
        return str;
    }
}