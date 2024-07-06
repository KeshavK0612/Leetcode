class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = { -1, -1 };

        // Find the first occurrence of target
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (start < nums.length && nums[start] == target) {
            res[0] = start;
        } else {
            return res; // Target not found
        }

        // Find the last occurrence of target
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (end >= 0 && nums[end] == target) {
            res[1] = end;
        }

        return res;
    }
}