class Solution {
    public int nthUglyNumber(int n) {
        int[] num = new int[n];
        num[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        int next2 = 2, next3 = 3, next5 = 5;

        for (int i = 1; i < n; i++) {
            int nextUgly = Math.min(Math.min(next2, next3), next5);
            num[i] = nextUgly;

            if (nextUgly == next2) next2 = 2 * num[++i2];
            if (nextUgly == next3) next3 = 3 * num[++i3];
            if (nextUgly == next5) next5 = 5 * num[++i5];
        }

        return num[n - 1];
    }
}