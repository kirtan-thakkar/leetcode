class Solution {
    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length;i++){
            char c = s[i];
            stack.push(c);
        }

        // while(!stack.empty()){
        //     char c = stack.top(); // pehle dekhna he
        //     stack.pop(c); // then pop karna he
        // }
        for(int i=0;i<s.length;i++){
            s[i] = stack.pop();
        }
    }
}