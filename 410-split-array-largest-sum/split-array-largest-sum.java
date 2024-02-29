class Solution {
    public int splitArray(int[] nums, int k) {
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            int value=ismax(nums,k,mid);
            if(value>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public int ismax(int[] arr,int k,int sum){
        int al=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]+last<=sum){
                last+=arr[i];

            }
            else{
                al++;
                last=arr[i];

            }
        }
        return al;
    }
}