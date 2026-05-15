class Solution {
    public void reverseString(char[] s) {
        // we will do it by two ways: swapping while moving till mid, two pointer.

        //first method

        // for(int i = 0; i<s.length/2; i++){
        //     char temp = s[i];
        //     s[i] = s[s.length-1-i];
        //     s[s.length-1-i] = temp;
        // }

        //second method
        int l = 0, r = s.length-1;
        while(l<r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }



    }
}