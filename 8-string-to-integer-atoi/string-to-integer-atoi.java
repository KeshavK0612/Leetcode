class Solution {
    public int myAtoi(String s) {
        int i = 0, sign = 1, result = 0;
        int n = s.length();

        // 1. Skip leading spaces
        while (i < n && s.charAt(i) == ' ') i++;

        // 2. Check for sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i++) == '-') ? -1 : 1;
        }

        // 3. Convert digits and check overflow
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i++) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
        }

        return result * sign;
    }
}
