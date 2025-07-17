//Input: nums = [-1,2,1,-4], target = 1
// Output: 2
// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        //for sorting arrays value
        Arrays.sort(nums);

        int currSum = nums[0] + nums[1] + nums[2];

        //for counting first index till 3 last index because we also taking left and right pointer
        for(int i = 0; i < nums.length-2; i++){

                int left = i + 1;
                int right = nums.length-1;

                while(left < right){

                    int result = nums[i] + nums[left] + nums[right];

                    //for compare if result is close to target value then update result value into currSum as a final output
                    if(Math.abs(result - target) < Math.abs(currSum - target)){

                        currSum = result;
                    }

                    else if (result < target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }

        }
        
        return currSum;
    }
}