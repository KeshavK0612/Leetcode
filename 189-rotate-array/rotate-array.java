class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length == 1 || k == nums.length){
            return; // no need to do anything
        }
        else if(nums.length < k){
            k = k % nums.length;
        }
        int j = nums.length - k;
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(j < nums.length){
                result[i] = nums[j++];
            }
            else{
                result[i] = nums[i-k];
            }
        }
        int i = 0;
        for(int r : result){
            nums[i] = result[i];
            i++;
        }
    }
}