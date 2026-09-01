class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int j = s.length()-1;
        for(int i = 0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb1.append(Character.toLowerCase(s.charAt(i)));
            }if(Character.isLetterOrDigit(s.charAt(j))){
                sb2.append(Character.toLowerCase(s.charAt(j)));
            }
            j--;
        }
        return sb1.toString().equals(sb2.toString());
        
    }
}
