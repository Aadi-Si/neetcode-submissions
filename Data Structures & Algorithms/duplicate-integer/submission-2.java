class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        for(int ele : nums){
            if(!arr.add(ele)){
                return true;
            }
        }
        return false;
    }
}