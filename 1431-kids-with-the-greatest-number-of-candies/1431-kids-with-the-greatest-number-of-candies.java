class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
       // boolean ans[] = new int[candies.length];
        for(int i = 1; i<candies.length; i++)
        {
            if (candies[i]>max)
                max = candies[i]; 
        }
        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i<candies.length; i++)
        {
           // candies[i] += extraCandies;
            if (candies[i] + extraCandies >= max)
            {
                result.add(true);
            }
            else
                result.add(false);
        }
        return result;
    }
}