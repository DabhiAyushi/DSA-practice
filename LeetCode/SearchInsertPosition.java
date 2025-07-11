// problem : - Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1

class Solution {
    public int searchInsert(int[] nums, int target) {

        //edge cases: if array is empty

        if(nums.length == 0)
        return 0;

        for(int i = 0; i < nums.length; i++){

            //if nums is bigger then print index value for example [1,3,5,6] target= 2 lets run the loop 
            //first take nums[0] = 1 not >= 2 then take another nums[1] = 3 >= 2 return 1
            if(nums[i] >= target){
                return i;
            }
        }

       return nums.length; 
        
    }

    
}