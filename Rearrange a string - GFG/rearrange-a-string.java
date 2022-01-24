// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.arrangeString(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String arrangeString(String s)
        {
            char[] c = new char[26];
            int l = s.length();
            int total =0;
            for(int i=0;i<l;i++){
                if(Character.isDigit(s.charAt(i)))
                total= total + (s.charAt(i)-'0');
                else c[s.charAt(i)-'A']++;
            }
            String sr = "";
            for(int i=0;i<26;i++)
            {
                if(c[i]>0){
                    char sl = (char)(i+65);
                    while(c[i]-->0)
                    sr = sr+sl;
                }
            }
            if(total>0){
                sr = sr+total;
            }
            return sr;
            
        }
}
