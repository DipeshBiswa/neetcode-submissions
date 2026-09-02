class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int res = 1;
        TreeSet<Integer> tree = new TreeSet<>();
        for(int i = 0; i <nums.length; i++){
            tree.add(nums[i]);
        }
        Integer count = 1;
        Integer preValue = tree.pollFirst();
        while(!tree.isEmpty()){
            int val = tree.pollFirst();
            if(preValue+1 == val){
                count++;
            }else{
                if(count >= res){
                    res = count;
                    count = 1;
                }
            }
            preValue = val;
            
        }
        if(count > res){
                    res = count;
                    count = 1;
                }
        return res;
    }
}
