class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i< s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }else{
                int value = map.get(s.charAt(i));
                map.put(s.charAt(i), value + 1);
            }
        }
        for(int i = 0; i < t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                int value = map.get(t.charAt(i))-1;
                if(value < 0){
                    return false;
                }
                map.put(t.charAt(i), value);
            }else{
                return false;
            }
        }
        return true;
    }
}
