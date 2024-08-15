//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {   
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.nthMagicNo(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long nthMagicNo(int n){
        //complete the function here
        long ans=0;
        long base=5;
        int mod=1000000007;
         while(n>0) {
             long last=n&1;
             n=n>>1;
             ans+=base%mod*last;
             base*=5%mod;
             
         }
         return ans%mod;}
}
