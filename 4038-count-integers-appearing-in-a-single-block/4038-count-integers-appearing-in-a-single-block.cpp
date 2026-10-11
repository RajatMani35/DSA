class Solution {
public:
    int countSpecialIntegers(vector<int>& nums) {
        map<int,int> mpp;
        // int length=nums.length;
        mpp[nums[0]]=1;
        for(int i=1;i<nums.size();i++){
                if(nums[i]!=nums[i-1]){
                    mpp[nums[i]]++;
                }
        }
        int count=0;
        for(auto &p:mpp){
            if(p.second ==1){
                count++;
            }
        }
        return count++;
    }
};