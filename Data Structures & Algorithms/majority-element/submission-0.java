class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums.length / 2; 
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                int v = map.get(nums[i]);
                map.put(nums[i], v+1);
            }
        }
        for(int key: map.keySet()){
            if(map.get(key) > majority){
                return key;
            }
        }
        return 0;
    }
}