class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:nums){
            sum+=num;
            if(sum==goal){
                count++;
            }
            count += mp.getOrDefault(sum - goal, 0);
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}