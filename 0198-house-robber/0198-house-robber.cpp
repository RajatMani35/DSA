class Solution {
public:
    int solve(vector<int>& nums, int index,vector<int>& dp){
        if(index<0){
            return 0;
        }
        if(index==0){
            return nums[index];
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int pick=nums[index]+solve(nums,index-2,dp);
        int notPick=solve(nums,index-1,dp);
        return dp[index]=max(pick,notPick);
    }
    int rob(vector<int>& nums) {
        int length=nums.size();
        vector<int> dp (length,-1);
        return solve(nums,length-1,dp);
    }
};