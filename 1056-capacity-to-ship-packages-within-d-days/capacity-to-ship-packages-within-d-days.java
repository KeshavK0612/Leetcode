class Solution {
    public static int findNumberOfDays(int[] weights, int capacity){
        int day = 1 , load = 0;

        for(int i = 0 ;i < weights.length ; i++){
            if(load + weights[i] > capacity){
                day = day + 1;
                load = weights[i];
            }else{
                load = load + weights[i];
            }
        }

        return day;
    }

    //Binary search 
    public int shipWithinDays(int[] weights, int days) {
        int maxi = Integer.MIN_VALUE , sum = 0;
        for(int i = 0 ;i < weights.length ; i++){
            sum = sum + weights[i];
            maxi = Math.max(weights[i] , maxi);
        }

       int low = maxi , high = sum ;

       while(low <= high){
           int mid = (low + high)/2;

           if((findNumberOfDays(weights , mid)) <= days){
               high = mid -1;
           }else{
               low = mid + 1;
           }
       }

        return low;
    }
}