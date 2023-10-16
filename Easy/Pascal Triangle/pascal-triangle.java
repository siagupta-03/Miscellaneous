//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            ArrayList<Long> ans = new Solution().nthRowOfPascalTriangle(n);
            printAns(ans);
        }
    }
    public static void printAns(ArrayList<Long> ans) {
        for (Long x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Long> ls = new ArrayList<>();
         long mod = 1000000007;
        long ans =1;
       ls.add(ans);
        
        for(int i =1; i< n ;i++){
         //   ans = ans*(n-i);
         //   ans=ans/i;
         ans = ( ans * (n - i)%mod) * modInverse(i, mod) % mod;
            ls.add(ans);
        }
      //  ls.add(ls);
        return ls;
    }
   
    long modInverse(long a, long mod) {
        long m0 = mod;
        long y = 0, x = 1;

        if (mod == 1)
            return 0;

        while (a > 1) {
            long q = a / mod;
            long t = mod;

            mod = a % mod;
            a = t;
            t = y;

            y = x - q * y;
            x = t;
        }

        if (x < 0)
            x += m0;

        return x;
    }
}