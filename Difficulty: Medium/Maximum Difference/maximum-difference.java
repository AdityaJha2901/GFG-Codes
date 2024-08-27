//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.findMaxDiff(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        
        int ls[] = new int[arr.length];
        int rs[] = new int[arr.length];
        
        for (int i = 0; i<arr.length; i++){
        //   left smaller array

            
            for (int j=i-1; j>=0; j--){
                // case 1 j goes below 0
                if(i==0){
                    ls[i]=0;
                }
                else if(arr[j]<arr[i]){
                    ls[i]=arr[j];
                    break;
                }
                else {
                    ls[i]=0;
                }
            }
           
            
            
        //   right smaller array
            
            
            for (int j=i+1; j<arr.length; j++){
                // case 1 j goes below 0
                if(i==arr.length-1){
                    rs[i]=0;
                }
                else if(arr[j]<arr[i]){
                    rs[i]=arr[j];
                    break;
                }
                else {
                    rs[i]=0;
                }
            }
          
            
        }
        // difference
        int diff = 0;
        for (int i =0; i<arr.length; i++){
            int temp = Math.abs(ls[i]-rs[i]);
            if(temp>diff){
                diff= temp;
            }
        }
        
        
        return diff;
    }
}
