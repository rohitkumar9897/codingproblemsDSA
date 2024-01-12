class Solution {
    public int countVowels(String s, int cnt){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                cnt++;
            }else if(s.charAt(i)=='e'){
                cnt++;
            }else if(s.charAt(i)=='i'){
                cnt++;
            }else if(s.charAt(i)=='o'){
                cnt++;
            }else if(s.charAt(i)=='u'){
                cnt++;
            }
        }
        return cnt;
    }
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int n= s.length();
        int x= countVowels(s.substring(0,n/2), 0);
        int y= countVowels(s.substring(n/2,n), 0);
        if(x==y){
            return true;
        }
        return false;
    }
}