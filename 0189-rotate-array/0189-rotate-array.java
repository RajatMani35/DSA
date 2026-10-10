class Solution {
    public void rotate(int[] nums, int k) {
        int length=nums.length;
        if(length==0) return ;
        k=k%length;
        int[] res =new int[length];
        for(int i=0;i<length;i++){
            res[(i+k)%length]=nums[i];
        }
        int i=0;
        for(int it:res){
            nums[i]=it;
            i++;
        }
    }
}