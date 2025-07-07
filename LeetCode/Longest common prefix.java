class Solution {
    public String longestCommonPrefix(String[] strs) {
        // edge cases : if array is empty then return 
        if(strs.length == 0)
        return "";

        //edge cases : if only one string available like ["hello"] then output ["hello"]
        String prefix = strs[0];

        
        //for read all strings from the array
        for(int i = 1; i< strs.length; i++){

            //no common prefix
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);

                if(prefix.isEmpty())
                return "";
            }
           

        }

        return prefix;
        
    }
}