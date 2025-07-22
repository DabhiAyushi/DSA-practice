//This is linear-search approach First try to use brute-force approach.
// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4
// Example 2:

// Input: nums = [4,5,6,7,0,1,2], target = 3
// Output: -1

class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            if(nums[right] == target) return right;
            if(nums[left] == target) return left;

                left++;
                right--;
        }
        return -1;
       
        
    }
}
