//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
public:
    vector<int> pattern(int N){
        // code herehttps://media.geeksforgeeks.org/img-practice/user_web-1598433228.svg
        vector<int> ans;
       if(N<0){
           ans.push_back(N);
           return ans;
       }
       int n = ceil(float(N)/5);
    //   cout<<n;
       for(int i=0; i<n+1; i++){
           ans.push_back(N);
          N=N-5;
       }
       N+=5;
       for(int i=0; i<n; i++){
           N=N+5;
        //   cout<<N<<endl;
           ans.push_back(N);
       }
       return ans;
    }
};


//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int N;
        cin>>N;
        
        Solution ob;
        vector<int> ans = ob.pattern(N);
        for(int u: ans)
            cout<<u<<" ";
        cout<<"\n";
    }
    return 0;
}
// } Driver Code Ends