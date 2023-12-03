class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int c = 0;
        for( int i = 0; i < nums.length-1; i++)
        {
            int element = nums[i];
            // for (int j = i+1; j < nums.length; j++)
            // {
                if(nums[i+1] == element)
                {
                    return true;
                }
            // }
        }
        return false;
    }
}