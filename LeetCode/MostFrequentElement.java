class Solution {
    public int mostFrequentElement(int[] nums) {
        int maxFreq = 0;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > maxFreq) {
                maxFreq = count;
                ans = nums[i];
            } else if (count == maxFreq) {
                ans = Math.min(ans, nums[i]); // choose smaller one
            }
        }

        return ans;
    }
}
