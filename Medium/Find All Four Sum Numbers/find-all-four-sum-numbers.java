//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] nums, int k) {
        // code here
      
       /* ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
          Arrays.sort(arr);
        
        int i=0;
        int j=i+1;
        int m=j+1;
        int l=arr.length-1;
        for( i=0 ; i <arr.length-3; i++){
            if(i>0 && arr[i]==arr[i-1])
            continue;
        }
        for( j =i+1; j < arr.length-2; j++){
            if(j>i+1 && arr[j]==arr[j-1])
            continue;
        }
        while(m<l){
            int  sum= arr[i]+arr[j];
            sum=sum +arr[m];
           sum=sum +arr[l];
            
            if(sum==k){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(arr[i]); 
                temp.add(arr[j]);
                 temp.add(arr[k]);
                  temp.add(arr[l]);
                  ans.add(temp);
                  m++;
                  l--;
                  while(m<l && arr[m]==arr[m-1]) m++;
                  while(m<l && arr[l]==arr[l+1])l--;
                
                
            }
            else if(sum>k){
                l--;
                
            }
            else{
                m++;
            }
        }
        return ans;
    }
}*/
 ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        int n = nums.length;
        
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            }
            
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue; // Skip duplicates
                }
                
                int left = j + 1;
                int right = n - 1;
                
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    
                    if (sum == k) {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        result.add(list);
                        left++;
                        right--;
                        
                        // Skip duplicates
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    } else if (sum < k) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
return result;}}