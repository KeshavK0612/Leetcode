class Solution {
    public String removeDuplicateLetters(String s) {
        final int[] lastIndexes = new int[26];

        for(int i = 0; i < s.length(); ++i)
            lastIndexes[s.charAt(i) - 'a'] = i;

        final Stack<Integer> stack = new Stack<>();
        final boolean[] seen = new boolean[26];

        for(int i = 0; i < s.length(); ++i) {
            final int idx = s.charAt(i) - 'a';

            if(!seen[idx]) {
                while(!stack.isEmpty() && stack.peek() > idx && i < lastIndexes[stack.peek()])
                    seen[stack.pop()] = false;

                stack.push(idx);
                seen[idx] = true;
            }
        }

        final StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty())
            sb.append((char) (stack.pop() + 'a'));

        return sb.reverse().toString();
    }
}