//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends

class Solution {

    public static String reverseWords(String str) {
        // Split the string by dot
        String[] words = str.split("\\.");
        
        // Initialize a StringBuilder to store the result
        StringBuilder reversedString = new StringBuilder();
        
        // Reverse the words by iterating from the last word to the first
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0) { // Append dot between words, but not after the last word
                reversedString.append(".");
            }
        }
        
        return reversedString.toString();
    }
}
