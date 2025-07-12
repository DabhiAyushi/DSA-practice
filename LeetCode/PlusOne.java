// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].

class Solution {
    public int[] plusOne(int[] digits) {

        //edge cases: if array is empty or 0 then increment it by 1

        if(digits.length == 0)
        return new int[]{1};

        //only want to increament last digits by 1 if value is less than 9  

        for(int i = digits.length-1; i >= 0; i--){

                if(digits[i] < 9){

                    digits[i]++;
                    return digits;
                }

                digits[i] = 0;
                
            
        }

        // if value is [9,9,9] then it's carry 1 then the output is [1,0,0,0] so we add extra place and add 1 to the 0th index
        
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
        

    }
}