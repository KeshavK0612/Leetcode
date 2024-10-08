class Solution {
    int check(int[] nums,int goal){
        int n=nums.length;
        if(goal<0)
            return 0;
        int l=0,r=0,c=0,s=0;
        while(r<n){
            s+=nums[r];
            while(s>goal){
                s-=nums[l];
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return check(nums,goal)-check(nums,goal-1);
    }
}