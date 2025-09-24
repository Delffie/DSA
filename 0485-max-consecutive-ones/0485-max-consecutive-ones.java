class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxlength=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else{
                count=0;
            }
            maxlength=Math.max(maxlength,count);
        }
        return maxlength;
        
    }
}