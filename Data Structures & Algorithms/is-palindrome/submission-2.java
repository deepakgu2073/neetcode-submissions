class Solution {
    public boolean isPalindrome(String s) {
        //first metod, two pointer
        // int i = 0, j = s.length()-1;
        // while(i<j){
        //     while(i<j && !Character.isLetterOrDigit(s.charAt(i))) i++;
        //     while(i<j && !Character.isLetterOrDigit(s.charAt(j))) j--;
        //     if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
        //     i++;
        //     j--;
        // }
        // return true;

        //second method
        StringBuilder sb = new StringBuilder();
         
        for(int i = 0;i<s.length(); i++){
            if(checkAlNum(s.charAt(i))) sb.append(Character.toLowerCase(s.charAt(i)));
        }
        String original = sb.toString();

        if(sb.reverse().toString().equals(original)) return true;
        else return false;

    }
    static boolean checkAlNum(char c){
        if((c>='0' && c<='9') || (c>='A' && c<='Z') || (c>='a' && c<='z')) return true;
        else return false;
    }
}
