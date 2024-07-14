class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        
        // Initialize the answer array to -1 for cases where no greater element is found
        for (int i = 0; i < ans.length; i++) {
            ans[i] = -1;
        }

        // Find the next greater element for each element in nums1
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    found = true;
                }
                if (found && nums2[j] > nums1[i]) {
                    ans[i] = nums2[j];
                    break;
                }
            }
        }
        
        return ans;
    }
}