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
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        int idx=-1;int i2=-1;
        for(int i=N-2; i>=0 ; i--){
            if(arr[i]<arr[i+1]){
                //found the breK POINT
                idx=i;
                break;
            }
        }
        if(idx==-1){
            reverse(arr, 0, N-1);
            return listt(arr);
        }
        else{
        for(int i=N-1; i>idx; i--){
            if(arr[i]> arr[idx]){
                i2=i;
                break;
            }
        }
        
        swap(arr, idx, i2);
            reverse(arr, idx+1, N-1);
            return listt(arr);
            
            
        }
    }
    
    static void swap(int arr[], int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }
    static void reverse(int arr[],int i, int j ){
        
        while(i<j){
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
          
            
        }
    }
     static List<Integer> listt(int[] nums){
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }
        return list;
}
}
