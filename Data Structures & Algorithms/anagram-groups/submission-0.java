class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hsmp = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String s = new String(charArray);
            if(!hsmp.containsKey(s)){
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hsmp.put(s,list);
            }
            else{
                hsmp.get(s).add(strs[i]);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for( String s: hsmp.keySet()){
            ans.add(hsmp.get(s));
        }
        return ans;

    }
}
