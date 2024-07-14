import java.util.Arrays;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        // Initialize result array with -1
        Arrays.fill(res, -1);

        // Iterate through each element to find its next greater element
        for (int i = 0; i < n; i++) {
            // Start from the next element and loop until the original element
            for (int j = 1; j < n; j++) {
                if (nums[(i + j) % n] > nums[i]) {
                    res[i] = nums[(i + j) % n];
                    break;
                }
            }
        }
        
        return res;
    }
}
