//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        //finding the target
        int total= 0;
        for(int i=0 ; i< N ;i++){
            total=total+arr[i];
        }
        if(total%2==1){
            return 0;
        }
        int target = total/2;
        boolean dp[][]= new boolean [N+1][target+1];
        
        //base
        
        //traget=0
        for(int idx=0 ; idx <N;idx++ ){
            dp[idx][0]= true;
            
        }
        if(arr[0]<=target){
            dp[0][arr[0]]=true;
        }
        
        
        boolean pick=false;
        for(int idx=1; idx<N ; idx++){
            for(int k =1 ; k<=target; k++){
                boolean not= dp[idx-1][k];
                if(arr[idx]<=k){
                    pick= dp[idx-1][k-arr[idx]];
                }
                dp[idx][k]= pick || not;
            }
        }
        return dp[N-1][target]?1:0;
    }
}