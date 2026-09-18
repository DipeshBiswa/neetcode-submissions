class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        Queue<Integer> queue = new ArrayDeque<>();

    int smallest = Integer.MAX_VALUE;
    int sum = 0;

    for (int r = 0; r < nums.length; r++) {

        queue.add(nums[r]);
        sum += nums[r];

        while (sum >= target) {
            smallest = Math.min(smallest, queue.size());

            sum -= queue.remove();
        }
    }

    return smallest == Integer.MAX_VALUE ? 0 : smallest;
    }
}