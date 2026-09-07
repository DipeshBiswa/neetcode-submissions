class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                int v = map.get(nums[i]) +1;
                map.put(nums[i],v );
            }
        }
        List<int[]> list = new ArrayList<>();
        for(int key: map.keySet()){
            int[] v = {map.get(key), key};
            list.add(v);
        }
        list.sort((a,b) -> b[0] - a[0]);
        for(int i =0; i<k; i++){
            res[i] = list.get(i)[1];
        }
        return res;

        
    }
}
