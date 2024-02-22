class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //int n = word1.length();
        String str1 = new String();
        String str2 = new String();
        for(String t : word1)
        {
            str1 = str1.concat(t);
        }
        for(String t : word2)
        {
            str2 = str2.concat(t);
        }
        if (str1.equals(str2))
        {
            return true;       
        }
        return false;
    }
}