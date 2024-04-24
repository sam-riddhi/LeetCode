class Solution {
    public int tribonacci(int n) {
        int a=0, b=1, c=1;
        if(n<2)
            return n;
        for(int i=3;i<=n;i++)
        {
            int ans = a + b + c;
            a = b;
            b = c;
            c = ans;
        }
        return c;
    }
}