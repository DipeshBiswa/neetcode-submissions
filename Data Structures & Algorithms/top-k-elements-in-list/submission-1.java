class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
            
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        for(int key: map.keySet()){
            int[] ar = {map.get(key), key};
            list.add(ar);
        }
        list.sort((a,b) -> b[0]- a[0]);
        int[] res = new int[k];
        for(int i = 0; i<k; i++){
            res[i] = list.get(i)[1];
        }
        return res;

    }
}
