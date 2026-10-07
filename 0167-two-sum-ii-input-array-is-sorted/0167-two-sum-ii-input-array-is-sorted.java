class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int length=nums.length;
        int complement=0;
        for(int i=0;i<length;i++){
            complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement)+1,i+1};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}