//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            t--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static long[] productExceptSelf(int nums[]) {
        // code here
        // initiate a new array
        
        long[] product = new long[nums.length];
        
            
        
        // for (int i =0; i<nums.length ; i++ ){
        //     int a = 1;   
        //     if (i==0){
                
        //         for (int j = 1; j<nums.length; j++){
                
        //             a= a*nums[j];
        //         }
        //     }
            
        //     if (i == nums.length-1){
        //         for (int j = 0; j<nums.length-1; j++){
                
        //             a= a*nums[j];
        //         }
        //     }
            
        //     if (i>0 && i<nums.length){
        //         for (int j = 0; j<nums.length-1; j++){
                
        //             a= a*nums[j];
        //         }
        //         a=a/nums[i];
        //     }

        //     product[i]= a;
        // }
        
        
        
        // //calculate the product of all
        // for (int j = 0; j<nums.length; j++){
            
        //         a= a*nums[j];
        // } 
       
        // for (int i=0; i<nums.length; i++){
        //     if(nums[i]!=0){
        //         product[i]= a/nums[i];
                
        //     } else {
        //         a=1;
        //         for(int j = 0; j<nums.length; j++){
        //             if (j!=i){
        //                 a=a*nums[j];
        //             }
        //         }
        //         product[i]=a;
                
        //     }
        for (int i=0; i<nums.length; i++){
            long a = 1;
            for (int j=0; j<nums.length; j++){
                if(j!=i){
                    a=a*nums[j];
                }
            }
            product[i]= a;
        }
        return product;
        
    }
}