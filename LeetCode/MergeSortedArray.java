//Merge Two sorted array

//nput: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m -1; // pointer in nums1
        int j = n -1; // pointer in nums2
        int k = m + n -1;// pointer to last index of nums1
        
        while( i >= 0 &&  j >=0){ //loop-1

            if( nums1[i] >= nums2[j]){
                nums1[k--] = nums1[i--];
            }

            else {
                
                nums1[k--] = nums2[j--];
            }
            
        }
        
        // If i > j, it means all elements from nums1 have been placed correctly at the back,
        //but some elements from nums2 are still remaining.
        //To handle this, we use another loop to copy the remaining elements from nums2 into the front of nums1

          while(j >= 0){ //loop-2
            nums1[k--] = nums2[j--];
        }
        

        
        
    }
}