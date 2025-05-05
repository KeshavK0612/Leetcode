class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maximum = Integer.MIN_VALUE;
        int sum = 0;
      for (int i = 0; i < n; i++) {

            sum += nums[i];

            if (sum > maximum) maximum = sum;

            if (sum < 0) sum = 0;
        }


        return (int)(maximum);
    }
}