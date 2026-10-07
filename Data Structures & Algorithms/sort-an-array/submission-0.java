class Solution {
    public int[] sortArray(int[] nums) {
        
        
        PriorityQueue<Integer> min = new PriorityQueue<>();

        for(int num: nums){
            min.add(num);
        }

        for(int i = 0; i<nums.length; i++){
            int n = min.poll();
            nums[i] = n;
        }
        return nums;

        
    }
}