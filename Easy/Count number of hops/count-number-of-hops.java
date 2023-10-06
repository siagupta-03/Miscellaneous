//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG implements Runnable {
    public void run() {
        try {
            BufferedReader in;
            PrintWriter out;
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(in.readLine().trim());

                Solution g = new Solution();
                out.println(g.countWays(n));
            }
            out.close();
        } catch (Exception e) {
            ;
        }
    }

    public static void main(String args[]) throws IOException {
        new Thread(null, new GFG(), "whatever", 1 << 26).start();
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {  long mod = 1000000007;
        long dp[]= new long[n+1];
        Arrays.fill(dp, -1);
        return f(n , dp)%mod;
    }
    static long f(int i ,long dp[]){
          long mod = 1000000007;
        
        if(i==0)return 1;
        if(i<0)return 0;
        
        if(dp[i]!=-1)return dp[i];
        long one= f(i-1, dp);
        long t= f(i-2, dp);
        long th= f(i-3, dp);
        return dp[i]= (one +t+ th)%mod;
        
        
    }
}