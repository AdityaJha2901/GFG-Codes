//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isStrong(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    static int[] f = new int[10];
    
    static void precompute(){
        f[0] = f[1] = 1;
        for (int i = 2; i<=9; i++){
            f[i] = f[i-1]*i;
        }
        return;
    }
    static int isStrong(int N) {
        // code here
        precompute();
        String str = N + "";
        int sum = 0;
        String[] cha = str.split("");
        
        for(int i = 0; i<cha.length; i++ ){
            
            int a = Integer.valueOf(cha[i]);
            sum = sum + f[a];
            
        }
        if(sum==N){
            return 1;
        }
        return 0;
    }
    
};