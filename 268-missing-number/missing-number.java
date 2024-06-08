class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;

        // XOR all indices and values in the array
        for (int i = 0; i < n; i++) {
            xor ^= i ^ nums[i];
        }

        // XOR the last index n
        xor ^= n;

        return xor;
    }
}
