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
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.countNumberswith4(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int countNumberswith4(int N) {
        
        int dp[]= new int [N+1];
        int sum=0;
        Arrays.fill(dp, -1);
        for(int i=0; i <= N ; i++){
            sum=sum+f(i , dp);
        }
        return sum;
        
        // code here
    }
    static int f(int n, int dp[]){
        if(n==0)return 0;
        
        if(n%10==4){
            return 1;
            
            
        }
        if(dp[n]!=-1)return dp[n];
        
        dp[n]= f(n/10, dp);
        return dp[n];
        
    }
};