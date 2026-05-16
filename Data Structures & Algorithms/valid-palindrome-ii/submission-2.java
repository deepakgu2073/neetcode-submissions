class Solution {
    public boolean validPalindrome(String s) {
        if(s.length() <= 2) return true;
        int i = 0, j = s.length()-1, count = 1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return (checkPalindrome(i+1,j,s) || checkPalindrome(i,j-1,s));
            }
            i++;
            j--;
        }
        return true;
    }
    public static boolean checkPalindrome(int i, int j, String s){
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}