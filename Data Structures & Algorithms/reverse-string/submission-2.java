class Solution {
    public void reverseString(char[] s) {
        // we will do it by three ways: swapping while moving till mid, two pointer, stack.

        //first method

        // for(int i = 0; i<s.length/2; i++){
        //     char temp = s[i];
        //     s[i] = s[s.length-1-i];
        //     s[s.length-1-i] = temp;
        // }

        //second method
        // int l = 0, r = s.length-1;
        // while(l<r){
        //     char temp = s[l];
        //     s[l] = s[r];
        //     s[r] = temp;
        //     l++;
        //     r--;
        // }

        //using a stack

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length; i++){
            stack.push(s[i]);
        }
        for(int i = 0;i <s.length; i++){
            s[i] = stack.pop();
        }




    }
}