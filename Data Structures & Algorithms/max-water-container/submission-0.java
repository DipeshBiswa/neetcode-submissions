class Solution {
    public int maxArea(int[] heights) {
        int longest = 0;
        int l = 0;
        int r = heights.length -1;
        while(l < r){
            int width = r - l;
            int height = Math.min(heights[l], heights[r]);
            longest = Math.max(width * height, longest);
            if(heights[l]>heights[r]){
                r--;
                continue;
            }
            if(heights[l] < heights[r]){
                l++;
                continue;
            }if(heights[l] == heights[r]){
                l++;
                continue;
            }
        }
        return longest;
    }
}
