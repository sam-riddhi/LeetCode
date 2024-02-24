class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], value + 1);
        }
        int ans  = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet())             {
            if (entry.getValue() > (n/2)) 
            {
                return entry.getKey();
            }
        }
        return -1;
    }
}