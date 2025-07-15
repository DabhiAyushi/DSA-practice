//Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

class Solution {
    public int maxArea(int[] height) {
        //edge cases: take all possible containers:-- for this, we have to take left boundaries and right boundaries

        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
         
            while(left < right) {

                //width
                int width = right - left;

                //Height
                int minHeight = Math.min(height[left], height[right]);

                //Find Area
                int area = width * minHeight;

                //area = 8;

                //maximum Area
                maxArea = Math.max(maxArea,area);

                if(height[left] < height[right]){
                    left++;
                }else {
                    right--;
                }

                

            }
                

             return maxArea;

            
        }

       

    
}