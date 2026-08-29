class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                int val = map.get(nums[i]) + 1;
                map.put(nums[i], val);
            }
        }
        
        List<int[]> list = new ArrayList<>();
        for(int key: map.keySet()){
            int[] v = new int[2];
            v[0] = map.get(key);
            v[1] = key;
            list.add(v);
        }
        list.sort((a,b) -> b[0]- a[0]);
        int[] ans = new int[k];
        for(int i = 0; i<k; i++){
            ans[i] = list.get(i)[1];
        }
        return ans;
    }
}
