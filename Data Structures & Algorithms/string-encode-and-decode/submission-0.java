class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0){return "";}
        List<Integer> size = new ArrayList<>();
        StringBuilder sbi = new StringBuilder();
        for(String s: strs){
            size.add(s.length());
            sbi.append(s);
        }
        StringBuilder sb = new StringBuilder();
        for(int i: size){
            sb.append(i +",");
        }
        sb.append('#');
        sb.append(sbi.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.length() == 0){
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while(str.charAt(i) != '#'){
            StringBuilder cur = new StringBuilder();
            while(str.charAt(i) != ','){
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;
        for(int sz :sizes){
            res.add(str.substring(i, i+sz));
            i += sz;
        }
        return res;
    }

    
        
}
