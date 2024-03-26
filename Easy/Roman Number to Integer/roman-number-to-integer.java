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
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        int i=0;
        int num=0;
        
        while(i<str.length()){
            
            if(str.charAt(i)=='M'){
                num+=1000;
                
            }else if(str.charAt(i)=='D'){
                num+=500;
                
                
            }
            else if(str.charAt(i)=='C' && i+1<str.length() && str.charAt(i+1)=='D'){
                num-=100;
                
            }
            else if(str.charAt(i)=='C' && i+1<str.length() && str.charAt(i+1)=='M'){
                num-=100;
                
            }
            else if(str.charAt(i)=='C'){
                num+=100;
                
                
            }else if(str.charAt(i)=='L'){
                num+=50;
                
            }
           else  if(str.charAt(i)=='X' && i+1<str.length() && str.charAt(i+1)=='L'){
                num-=10;
                
            }
           else  if(str.charAt(i)=='X' && i+1<str.length() && str.charAt(i+1)=='C'){
                num-=10;
                
            }else if(str.charAt(i)=='X'){
                num+=10;
                
            }else if(str.charAt(i)=='V'){
                num+=5;
                
            }
         else   if(str.charAt(i)=='I' && i+1<str.length() && str.charAt(i+1)=='X'){
                num-=1;
                
            }
            else if(str.charAt(i)=='I' && i+1<str.length() && str.charAt(i+1)=='V'){
                num-=1;
                
            }
            else if(str.charAt(i)=='I'){
                num+=1;
                
            }
            i++;
        }
        return num;
    }
}