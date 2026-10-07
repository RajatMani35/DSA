class Solution {
    public int binarySearch(int[] nums, int target, int startIndex){
        int l=startIndex;
        int r=nums.length-1;
        while(r>=l){
            int mid =(l+r)/2;
            if(nums[mid]>target){
                r=mid-1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else return mid;
        }
        return -1;
    }
    public int[] twoSum(int[] nums, int target) {
        int length=nums.length;
        int complement=0;
        for(int i=0;i<length;i++){
            complement=target-nums[i];
            int searchedIndex= binarySearch(nums,complement,i+1);
            if(searchedIndex!=-1){
                return new int[]{i+1,searchedIndex+1};
            }
        }
        return new int[]{-1,-1};
    }
}