class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int MaxArea = 0;
        while(left<right){
            int widthofthecontainer = right - left;
            int heightofthecontainer = Math.min(height[left],height[right]);
            int area = widthofthecontainer * heightofthecontainer;
            MaxArea = Math.max(MaxArea,area);
            
            if(height[left]<height[right]){
                left++;
            } 
            else{
                right--;
            }
        }
        return MaxArea;
    }
}