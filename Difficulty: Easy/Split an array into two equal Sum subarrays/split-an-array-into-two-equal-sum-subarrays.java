//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");

            int[] arr = new int[s.length];
            for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(s[i]);

            Solution obj = new Solution();
            boolean res = obj.canSplit(arr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// class Solution {
//     public boolean canSplit(int arr[]) {
//         // code here
//         int r1= arr[0];
//         int r2 =arr[arr.length-1];
//         int c1 = 1;
//         int c2 =1;
       
        
//       while (c1+c2 <= arr.length-1){
                    
//             if (r1<r2){
//                 r1 += arr[c1];
//                 c1++;
//             }
            
//             else if (r1>r2){
//                 r2+= arr[arr.length-1-c2];
//                 c2++;
//             }
            
//             else {
//                 r1 += arr[c1];
//                 r2+= arr[arr.length-1-c2];
//                 c1++;
//                 c2++;
//             }
        
//         }    
//         return r1==r2;
//     } 
// }
class Solution {
    public boolean canSplit(int arr[]) {
        int i=0,j=arr.length-1,sum1=0,sum2=0;
        while(i<=j){
            if(sum1<sum2){
                sum1+=arr[i];
                i++;
            }
            else if(sum1>sum2){
                sum2+=arr[j];
                j--;
            }
            else{
                if(i==j && sum1==sum2)
                    return false;
                sum1+=arr[i];
                sum2+=arr[j];
                i++;
                j--;
            }
        }
        // System.out.println(sum1+" "+sum2);
        if(sum1==sum2)
            return true;
        else
            return false;
    }
}