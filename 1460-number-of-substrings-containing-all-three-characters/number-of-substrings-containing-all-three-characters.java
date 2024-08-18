class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3]; // To count occurrences of 'a', 'b', 'c'
        int res = 0; // To store the result
        int i = 0; // Left pointer of the window

        // Iterate through the string with the right pointer
        for (int j = 0; j < s.length(); j++) {
            // Increment the count of the current character
            count[s.charAt(j) - 'a']++;

            // Shrink the window from the left while it remains valid
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                // All substrings starting from index i to j are valid
                res += s.length() - j;
                
                // Decrement the count of the character at the left pointer
                count[s.charAt(i) - 'a']--;
                
                // Move the left pointer to the right
                i++;
            }
        }
        return res;
    }
}
