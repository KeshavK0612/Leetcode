class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k-->0){
            int num = nums[0];
            int index = 0;
            for(int j = 1; j<nums.length; j++){
                if(nums[j]<num){
                    num = nums[j];
                    index = j;
                }
            }
            nums[index] = nums[index] * multiplier;
        }
        return nums;
    }
}