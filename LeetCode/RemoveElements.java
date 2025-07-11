//Problem: - Input: nums = [0,1,2,2,3,0,4,2], val = 2
//Output: 5, nums = [0,1,4,0,3,_,_,_]
//Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
//Note that the five elements can be returned in any order.
//It does not matter what you leave beyond the returned k (hence they are underscores).
 
class Solution {
    public int removeElement(int[] nums, int val) {

        //edge cases: if array is empty 
        
        
        if(nums.length == 0)
        return 0;

        //edge cases: if it is single elements

        int i = 0;

        for(int j = 0; j < nums.length; j++){

            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }

        return i;

        //edge cases: if all elements are same as value like nums = [1,1,1] and val = 1 then return 0

        //edge cases: if there are no elements available which is equal to val like nums = [1,2,3] and val = [5] then return 3
        
    }
}