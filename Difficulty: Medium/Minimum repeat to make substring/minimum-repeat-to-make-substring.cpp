//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++
class Solution {
public:
    int minRepeats(string& s1, string& s2) {
        // Calculate the minimum number of repetitions of s1 to cover the length of s2
        int repeatCount = (s2.length() + s1.length() - 1) / s1.length(); // Equivalent to ceil(s2.length() / s1.length())
        
        // Create the repeated string
        string repeatedS1 = "";
        for (int i = 0; i < repeatCount; ++i) {
            repeatedS1 += s1;
        }
        
        // Check if s2 is a substring of repeatedS1
        if (repeatedS1.find(s2) != string::npos) {
            return repeatCount;
        }
        
        // Try with one more repetition
        repeatedS1 += s1;
        
        // Check again if s2 is a substring
        if (repeatedS1.find(s2) != string::npos) {
            return repeatCount + 1;
        }
        
        // If no such substring found, return -1
        return -1;
    }
};



//{ Driver Code Starts.

int main() {
    int t;
    scanf("%d ", &t);
    while (t--) {
        string A, B;
        getline(cin, A);
        getline(cin, B);

        Solution ob;
        cout << ob.minRepeats(A, B) << endl;
    }
    return 0;
}
// } Driver Code Ends