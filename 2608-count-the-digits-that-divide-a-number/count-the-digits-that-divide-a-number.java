class Solution {
    public int countDigits(int num) {
        int oriNum = num;
        int count = 0;

        while(oriNum>0){
            int temp = oriNum%10;
            oriNum = oriNum/10;

            if(num%temp == 0){
                count++;
            }
        }
        return count;
    }
}