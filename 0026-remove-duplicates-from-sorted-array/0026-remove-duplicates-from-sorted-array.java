class Solution {
    public int removeDuplicates(int[] nums) {
        int length =nums.length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(nums[i]==nums[j]){
                    for(int k=j;k<length-1;k++){
                        nums[k]=nums[k+1];
                    }
                    length--;
                    j--;
                }
            }
        }
        return length;
    }
}