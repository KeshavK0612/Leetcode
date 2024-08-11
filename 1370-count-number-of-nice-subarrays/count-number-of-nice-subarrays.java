class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return check(nums,k)-check(nums,k-1);
    }

     int check(int[] nums,int k){
        int n=nums.length;
        if(k<0)
            return 0;
        int l=0,r=0,c=0,s=0;
        while(r<n){
            s+=nums[r]%2;
            while(s>k){
                s-=nums[l]%2;
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;
    }
}