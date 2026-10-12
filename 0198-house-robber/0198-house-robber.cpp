class Solution {
public:
    int rob(vector<int>& nums) {
        int length=nums.size();
        vector<int> dp (length,-1);
        dp[0]=nums[0];
        for(int i=1;i<length;i++){
            int pick=nums[i];
            if(i>=2){
                 pick=nums[i]+dp[i-2];
            }
            int notPick=dp[i-1];
            dp[i]=max(pick,notPick);
        }
        return dp[length-1];
    }
};