class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length-1;

        while(l <= r){
            char temp = s[l];
            char temp2 = s[r];
            s[l] = temp2;
            s[r] = temp;
            l++;
            r--;
        }   
    }
}