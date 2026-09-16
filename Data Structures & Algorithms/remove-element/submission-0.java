class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int l = 0;
        int r = nums.length-1;

        while(l < r){
            if(nums[r] == val){
                r--;
                continue;
            }else if (nums[l] == val && nums[r] != val){
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                r--;
                l++;
            }
            else{
                l++;}
        }
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == val){
                return k;
            }else{
                k++;
            }

        }
        return k;
    }
}