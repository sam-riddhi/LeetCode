class Solution {
    public String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++)
        {
            char current = s.charAt(i);
            int asc = (int) current;
            
            if (65 <= asc && asc <= 90)
            {
                current = (char) (current +32);
                str.append(current);
            }
            else
            {
                str.append(current);    
            }
        }
        return str.toString();
    }
}