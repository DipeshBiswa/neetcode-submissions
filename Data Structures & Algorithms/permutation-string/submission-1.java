class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()> s2.length()){
            return false;
        }
        int[] counter = new int[26];
        for(int i = 0; i<s1.length(); i++){
            counter[s1.charAt(i) - 'a']++;
        }
        int l = 0;
        int r = s1.length()-1;

        while(r < s2.length()){
            int[] sCount = new int[26];
            for(int i = l; i<= r; i++){
                sCount[s2.charAt(i) - 'a']++;
            }
            boolean approach = Arrays.equals(counter, sCount);
            if(approach){
                return true;
            }
            r++;
            l++;
            }
            
        
        return false;    
    }
}
