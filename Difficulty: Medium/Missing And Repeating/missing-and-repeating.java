//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[]) {
        int[] ans = new int[2];
        
        int n = arr.length;
        // Iterate and mark visited elements using negation of the values at corresponding indices
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1; // get corresponding index
            
            // If the value at that index is already negative, we found the duplicate
            if (arr[index] < 0) {
                ans[0] = Math.abs(arr[i]); // Duplicate element
            } else {
                arr[index] = -arr[index]; // Mark as visited
            }
        }
        
        // Find the missing element by checking positive values
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans[1] = i + 1; // Missing element
            }
        }
        
        return ans;
    }
}
