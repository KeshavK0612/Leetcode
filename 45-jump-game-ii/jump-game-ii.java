import java.util.*;
class Solution {
    public int jump(int[] nums) {
        int near = 0, far = 0, jumps = 0;
        int farthest = 0;

        while (far < nums.length - 1) {
            for (int i = near; i <= far; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            near = far + 1;
            jumps++;
            far = farthest;
        }

        return jumps;        
    }
}