class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int res = 0;
        for(int n:set){
            if(!set.contains(n-1)){
                int longest = 0;
                while(set.contains(n + longest)){
                    longest++;
                }
                res = Math.max(res, longest);
            }
        }
        return res;
    }
}
