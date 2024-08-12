class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int max = 0;

        int numZeroes = 0;
        for (right = 0; right < nums.length; right++) {

            if (nums[right] == 0)
                numZeroes++;

            if (numZeroes > k) {
                if (nums[left] == 0)
                    numZeroes--;
                left++;
            }
            if (numZeroes <= k) {
                max = Math.max(max, right - left + 1);
            }
        }
        return max;
    }
}