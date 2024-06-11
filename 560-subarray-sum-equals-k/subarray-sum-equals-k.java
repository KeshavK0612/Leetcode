import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length; 
        Map<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;

        // Initialize the map with the base case
        mpp.put(0, 1); 
        
        // Traverse through the array
        for (int i = 0; i < n; i++) {
            preSum += nums[i]; // Update the prefix sum

            // Calculate the value needed to form the sum k
            int remove = preSum - k;

            // Add to count the number of times the needed value has been seen
            cnt += mpp.getOrDefault(remove, 0);

            // Update the map with the current prefix sum
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt; // Return the total count of subarrays with sum k
    }
}