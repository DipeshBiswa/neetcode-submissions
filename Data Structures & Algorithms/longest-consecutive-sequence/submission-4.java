class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int res = 1;
        for(int n : set){
            ; 
            if(!set.contains(n-1)){
                int longest = 1;
                while(set.contains(n + longest)){
                    longest++;
                }
                res = Math.max(longest, res);
            }
            
        }
        return res;
    }
}
