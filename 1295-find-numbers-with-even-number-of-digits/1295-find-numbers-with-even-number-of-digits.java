class Solution {
    public int findNumbers(int[] nums) {
        int d = 0;
        for (int i = 0; i < nums.length; i++)
        {
            int c= 0;
            while (nums[i] > 0)
            {
                c++;
                nums[i] = nums[i]/10;
            }
            if (c%2 == 0)
            {
                d++;
            }
        }
        return d;
    }
}