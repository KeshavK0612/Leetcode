class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // If goal is 0, special case handling
        if (goal == 0) {
            return atMost(nums, 0);
        }
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    private int atMost(int[] nums, int goal) {
        int count = 0;
        int left = 0;
        int currentSum = 0;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            // Slide the window to the right while the sum exceeds the goal
            while (currentSum > goal && left <= right) {
                currentSum -= nums[left++];
            }

            // Count the number of subarrays ending at `right` and summing up to <= `goal`
            count += (right - left + 1);
        }

        return count;
    }
}
