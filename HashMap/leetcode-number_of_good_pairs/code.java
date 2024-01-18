class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i], h.get(nums[i])+1);
            }
            else{
                h.put(nums[i] , 1);
            }
        }
        // hashmap has been used to add count of pairs
        // possible from an index
        for(int i=0; i<nums.length; i++){
            if(h.containsKey(nums[i])){
                count = count + h.get(nums[i])-1;
                h.put(nums[i], h.get(nums[i])-1);
            }
        }
        return count;
    }
}