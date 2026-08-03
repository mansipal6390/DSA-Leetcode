class Solution {
public:
    int const value=1e9+7;
    string stoneGameIII(vector<int>& stoneValue) {
     int n=stoneValue.size();
     vector<int>dp(n+1,-value);
     dp[n]=0;
     for(int i=n-1;i>=0;i--){
        for(int j=i,x=0;j<=min(n-1,i+2);j++){
            x+=stoneValue[j];
            dp[i]=max(dp[i],x-dp[j+1]);
        }
     }
     if(dp[0]==0){
        return "Tie";
     }
     else if(dp[0]>0){
        return "Alice";
     }
     else{
        return "Bob";
     }
    }
};