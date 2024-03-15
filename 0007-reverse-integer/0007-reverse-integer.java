class Solution {
    public int reverse(int x) {
        int n = x;
        long rev = 0;
        while (n != 0)
        {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n /10;
        }
         if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
             {
                 return 0;
             }
         else
         {
             return (int) rev;
         }
    }
}