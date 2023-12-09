//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.smithNum(n));
        }
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution {
    static int smithNum(int n) {
        // code here
        int num = n;
        int[] least_prime = primeFactors(n);
        if (least_prime[n] == n) return 0;
        int sum_factors =  0;
        while(least_prime[num] != num){
            sum_factors += sum(least_prime[num]);
            num = num/least_prime[num];
        }
        sum_factors +=  sum(least_prime[num]);
        
        int sum_digits = sum(n);
        if (sum_digits == sum_factors) return 1;
        return 0;
    }
    
    private static int[] primeFactors(int n){
        int[] least_prime = new int[n+1];
        least_prime[1] = 1;
        for(int i = 2; i <= n; i++){
            if (least_prime[i] == 0){
                least_prime[i] = i;
            }
            for (int j = i*i; j <= n && j >= 0; j += i)
                    if (least_prime[j] == 0)
                        least_prime[j] = i;
        }
        
        return least_prime;
    }
    private static int sum(int n){
        int sum_digits = 0;
        while(n != 0){
            sum_digits += n%10;
            n = n/10;
    }
    return sum_digits;
    }
};