class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        int n = nums.length;

        // Step 1: Find the first index from the end where nums[i] < nums[i + 1]
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        // Step 2: If no such index is found, reverse the entire array
        if (ind == -1) {
            reverseArray(nums, 0, n - 1);
        } else {
            // Step 3: Find the next greater element from the end and swap it with nums[ind]
            for (int i = n - 1; i > ind; i--) {
                if (nums[i] > nums[ind]) {
                    int temp = nums[i];
                    nums[i] = nums[ind];
                    nums[ind] = temp;
                    break;
                }
            }
            // Step 4: Reverse the array from ind+1 to the end
            reverseArray(nums, ind + 1, n - 1);
        }
    }

    // Utility function to reverse the array from start to end
    static void reverseArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
}
