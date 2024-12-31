//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // Read first array
            String input = br.readLine();
            String[] inputArray = input.split(" ");
            int[] arr = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();

            Solution ob = new Solution();
            int res = ob.longestConsecutive(arr);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int longestConsecutive(int[] arr) {
        // code here
        Arrays.sort(arr);
        int max=0;
        int k=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
            continue; 
           if(arr[i]==arr[i+1]-1){
               k++;
           } 
           else{
               max=Math.max(max,k);
               k=1;
           }
        }
        max=Math.max(max,k);
        return max;
    }
} 