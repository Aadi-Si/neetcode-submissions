class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> map = new HashMap<>();
        int count = 1;
        for(int ele : nums){
           map.put(ele,map.getOrDefault(ele,0)+1);
        }
        ArrayList<Integer> arr = new ArrayList<>(map.keySet());
        arr.sort((a,b) -> map.get(b) - map.get(a));
        int[] result = new int[k];
        for(int i = 0 ; i < k ; i++){
            result[i]  = arr.get(i);
        }
        return result;
    }
}
