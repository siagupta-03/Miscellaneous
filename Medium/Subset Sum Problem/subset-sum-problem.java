//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        boolean dp [][]= new boolean[N+1][sum+1];
        
        //if target reached target=0
        
        for(int idx=0 ; idx< N ; idx++){
            dp[idx][0]=true;
        }
        //if idx is 0;
     if(arr[0]<=sum){
         dp[0][arr[0]]=true;
     }
        
        
        
        //idx loop
        //target loop
        boolean pick=false;
        for(int idx= 1 ; idx <N ; idx++){
            for(int target =1; target<=sum; target++){
                boolean not= dp[idx-1][target];
                if(target>=arr[idx]){
                    pick= dp[idx-1][target-arr[idx]];
                }
                dp[idx][target]= pick||not;
                
                
            }
        }
        return dp[N-1][sum];
    }
}