class Solution {
    public int pivotInteger(int n) {
        
        int totalSum = n*(n+1)/2;
        
        int left = 1;
        int right = n;
        
        while (left <= right)
        {
            int mid_pivot = left + (right - left)/2;
            
            if (mid_pivot * mid_pivot == totalSum)
            {
                return mid_pivot;
            }
            else if (mid_pivot * mid_pivot < totalSum)
            {
                left = mid_pivot + 1;
            }
            else
            {
                right = mid_pivot - 1;
            }
        }
        return -1;
    }
}