//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine().trim();
            String[] S1 = s1.split(" ");
            int n = Integer.parseInt(S1[0]);
            int k = Integer.parseInt(S1[1]);
            String s2 = br.readLine().trim();
            String[] S2 = s2.split(" ");
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(S2[i]);
            }
            Solution ob = new Solution();
            boolean ans = ob.canPair(nums, k);
            if (ans)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}

// } Driver Code Ends




// User function Template for Java

class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        if (nums.length % 2 == 1)
            return false;

        // Create a HashMap to store the frequency of remainders
        Map<Integer, Integer> remainderFrequency = new HashMap<>();

        // Count the frequency of each remainder
        for (int num : nums) {
            int remainder = (num % k + k) % k; // Handle negative numbers
            remainderFrequency.put(remainder, remainderFrequency.getOrDefault(remainder, 0) + 1);
        }

        for (int num : nums) {
            int remainder = (num % k + k) % k; 

            // If the remainder is 0, check if the frequency is even
            if (remainder == 0) {
                if (remainderFrequency.getOrDefault(0, 0) % 2 == 1)
                    return false;
            }
            // For non-zero remainders, check if there is a corresponding pair
            else if (remainderFrequency.getOrDefault(remainder, 0) != remainderFrequency.getOrDefault(k - remainder, 0))
                return false;
        }

        return true;
    }
}