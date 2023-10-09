//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


/**class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
       // return {lb(arr, x), ub(arr, x)};
       ArrayList<Integer> result = new ArrayList<>();
    ArrayList<Integer> lowerBounds = lb(arr, x);
    ArrayList<Integer> upperBounds = ub(arr, x);
return result;
        
        
    }
    int lb(int arr[], int x){
        int l=0;
        int h=arr.length-1;
        int lower=-1;
        while(l<=h){
            int m= (l+h)/2;
            if(arr[m]==x){
                lower= m;
                h=m-1;
                
            }
            else if(arr[m]>x){
                h=m-1;
            }
            else{
                l=m+1;
            }
                
            }
            return lower;
        }
        int ub(int arr[], int x){
        int l=0;
        int h=arr.length-1;
        int upper=-1;
        
        while(l<=h){
            int m= (l+h)/2;
            if(arr[m]==x){
                upper= m;
                l=m+1;
                
            }
            else if(arr[m]>x){
                h=m-1;
            }
            else{
                l=m+1;
            }
                
            }
            return upper;
        }
        
        
    }**/
    import java.util.ArrayList;

class GFG {
    ArrayList<Integer> find(int arr[], int n, int x) {
        ArrayList<Integer> result = new ArrayList<>();
        int lower = lb(arr, x);
        int upper = ub(arr, x);
        result.add(lower);
        result.add(upper);
        return result;
    }

    int lb(int arr[], int x) {
        int l = 0;
        int h = arr.length - 1;
        int lower = -1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (arr[m] == x) {
                lower = m;
                h = m - 1;
            } else if (arr[m] > x) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return lower;
    }

    int ub(int arr[], int x) {
        int l = 0;
        int h = arr.length - 1;
        int upper = -1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (arr[m] == x) {
                upper = m;
                l = m + 1;
            } else if (arr[m] > x) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return upper;
    }
}





//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Integer> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends