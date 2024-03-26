class Solution {
public:
    int missingNumber(vector<int>& nums) {
        ios_base::sync_with_stdio(false);
        int ans=nums.size();
        sort(nums.begin(),nums.end());
        for(int i=0;i<nums.size();i++){
            if(nums[i]!=i){
                ans=i;
                break;
            }
        }
        return ans;
    }
};