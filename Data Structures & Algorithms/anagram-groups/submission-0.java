class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            int[] array = new int[26];
            for(char c : s.toCharArray()){
                array[c - 'a']++;
            }
            String string = Arrays.toString(array);
            if(!map.containsKey(string)){
                map.put(string, new ArrayList<>());
                map.get(string).add(s);
            }else{
                map.get(string).add(s);
            }
        }
        return new ArrayList<>(map.values());
    }
}
