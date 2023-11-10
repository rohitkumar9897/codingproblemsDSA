class Solution {
    public int myAtoi(String s) {
        int ans=0;
        int k=1;
        boolean t= false;
        // Inside the for loop
for (int i = 0; i < s.length(); i++) {
    while (i < s.length() && s.charAt(i) == ' ') {
        i++;
    }
    if (i < s.length() && s.charAt(i) == '-' && i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
        k = -1;
        i++;
    }
    if (i < s.length() && s.charAt(i) == '+' && i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
    i++;
}
    while (i < s.length() && Character.isDigit(s.charAt(i))) {
        int digit = s.charAt(i) - '0';
        // Check for integer overflow
        if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > 7)) {
            return (k == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        ans = ans * 10 + digit;
        i++;
    }
    break;
}
        return k*ans;
    }
}