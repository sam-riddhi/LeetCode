class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
        {
            return x;
        }

        int start = 1;
        int end = x;
        int mid = -1;

        while(start <= end) {
            //find the middle element
           // int mid = (start+end)/2;  //might be possible that (start+end) exceeds the range of integer in java
            mid  = start + (end - start) / 2;

            if ((long) mid*mid > (long)x) {
                end = mid - 1;
            }
            else if ((long) mid*mid == (long) x) {
                return mid;
            }
            else {
                 start = mid + 1;
            }
        }
        return Math.round(end);
    }
}