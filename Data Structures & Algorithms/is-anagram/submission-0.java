class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] frequency1 = buildFrequency(s);
        int[] frequency2 = buildFrequency(t);
        for(int i = 0; i<26; i++){
            if(frequency1[i] != frequency2[i]) return false;
        }
        return true;
        
        
    }
    public static int[] buildFrequency(String s){
        int[] frequency = new int[26];
        for(int i = 0; i<s.length(); i++){
            frequency[s.charAt(i)-97] += 1;
        }
        return frequency;
    }
}
