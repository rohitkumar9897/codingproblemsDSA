class Solution {
    public String largestGoodInteger(String num) {
        int count = 0;
        String ans = "";
        String s = "";
        for (int i = 0; i < num.length() - 1; i++) {
            if (num.charAt(i) == num.charAt(i + 1)) {
                count++;
            } else {
                count = 0;
            }
            if (count >= 2) {
                ans = num.substring(i-1,i+2);
                if(ans.compareTo(s)>0){
                    s=ans;
                }
            }
        }
        return s;
    }
}