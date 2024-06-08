import java.util.ArrayList;
class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int n = nums.length;
        for(int i = 0; i<n;i++){
            if(nums[i]!=0){
                temp.add(nums[i]);
            }
        }
        for(int i = 0;i<temp.size();i++){
            nums[i] = temp.get(i);
        }
        int nonz = temp.size();
        for(int i = nonz; i<n ; i++){
            nums[i] = 0;
        }
    }
}