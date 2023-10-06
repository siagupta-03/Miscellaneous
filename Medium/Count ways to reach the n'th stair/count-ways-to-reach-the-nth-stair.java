//{ Driver Code Starts
import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking count of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    Solution obj = new Solution();
		    
		    //calling method countWays() of class
		    //DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}
// } Driver Code Ends


class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {int m = 1000000007;
        
        // your code here
        int dp[]= new int [n+1];
        Arrays.fill(dp, -1);
        return f(n , dp);
        
        
    }
    
    int f(int idx , int dp[]){
        int m =1000000007;
        if(idx<0)return 0;
        if(idx==0 || idx==1)return 1;
        if(dp[idx]!=-1)return dp[idx];
        int one= f(idx-1, dp)%m;
        int two=f(idx-2 , dp)%m;
        return dp[idx]= (one+two)%m;
        
    }
}

