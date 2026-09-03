class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(String s: strs){
            int[] arry = new int[26];
            for(char c: s.toCharArray()){
                arry[c -'a']++;
            }
            String aString = Arrays.toString(arry);
            if(!map.containsKey(aString)){
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                map.put(aString, list);
            }else{
                ArrayList<String> l = map.get(aString);
                l.add(s);
                map.put(aString,l);
            }
        }
        for(String key: map.keySet()){
            ArrayList<String> l = map.get(key);
            res.add(l);
            
        }
        return res;

    }
}
