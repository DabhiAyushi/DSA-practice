class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {
        // Your code goes here

        
        // this map is make a bucket for array
        Map<Integer, Integer> map = new HashMap<>();
        //This for loop count numbers and add frequencies
        for(int i =0; i<nums.length; i++){
            int num = nums[i];
            if (map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }

        // create a list to store final answer
            List<List<Integer>> result = new ArrayList<>();

            //convert each map entry into pair like [numbers, frequency]
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){

                //create a small list to store this pair
                List<Integer> pairs = new ArrayList<>();
                pairs.add(entry.getKey()); // get the unique numbers
                pairs.add(entry.getValue()); // get how many times it appears
                result.add(pairs);

              
            }

            return result;

            
        

    }
}