//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                
            }
            Solution obj=new Solution();
            int res=obj.minimumEnergy(arr,N);
            System.out.println(res);
            
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    public int minimumEnergy(int arr[],int N){
        
        
        
        int dp[]=  new int [N+1];
        Arrays.fill(dp,-1);
        return recur(arr,N-1,dp);}
        public int recur(int arr[], int N , int dp[]){
        
        if(N==0)return 0;
      if(dp[N]!=-1)return dp[N];
        int left= recur(arr,N-1, dp)+ Math.abs(arr[N-1]-arr[N]);
        int right= Integer.MAX_VALUE;
        if(N>1)
         right= recur(arr, N-2, dp)+Math.abs(arr[N-2]-arr[N]);
        
         return dp[N]=Math.min(left,right);
         
    }
}