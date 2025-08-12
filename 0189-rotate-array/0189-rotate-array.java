class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k= k%n;
        int left =0;
        int right= nums.length-1;

        reversearray(nums,left,right);
        reversearray(nums,0,k-1);
        reversearray(nums,k,right);
        
    }
    private void reversearray(int[]nums,int left,int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right]= temp;
            left++;
            right--;
            
        }
        
    }
}