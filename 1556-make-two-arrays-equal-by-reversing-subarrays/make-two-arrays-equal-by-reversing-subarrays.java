class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) {
            return false;
        }
        
        // Assuming the values are within a fixed range, e.g., 1 to 1000
        int[] count = new int[1001];
        
        // Count occurrences in the target array
        for (int num : target) {
            count[num]++;
        }
        
        // Decrease the count for each number in arr
        for (int num : arr) {
            if (count[num] == 0) {
                return false;
            }
            count[num]--;
        }
        
        return true;
    }
}
