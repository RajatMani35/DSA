class Solution {
public:
    int rob(vector<int>& nums) {
        int length=nums.size();
        int prev1=nums[0];
        int prev2=0;
        int curri;
        for(int i=1;i<length;i++){
            int pick=nums[i];
            if(i>=2){
                 pick=nums[i]+prev2;
            }
            int notPick=prev1;
            curri=max(pick,notPick);
            prev2=prev1;
            prev1=curri;
        }
        return prev1;
    }
};