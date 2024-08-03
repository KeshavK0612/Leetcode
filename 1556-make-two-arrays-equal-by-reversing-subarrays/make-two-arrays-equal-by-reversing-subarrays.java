class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) {
            return false;
        }
        
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // Count occurrences in the target array
        for (int num : target) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Decrease the count for each number in arr
        for (int num : arr) {
            if (!countMap.containsKey(num) || countMap.get(num) == 0) {
                return false;
            }
            countMap.put(num, countMap.get(num) - 1);
        }
        
        return true;
    }
}