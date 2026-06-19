class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder("");
        stack.push(s.charAt(0));
        for(int i =1 ;i<s.length();i++){
            char c = s.charAt(i);
            if(!stack.empty() && stack.peek()==c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        while(!stack.empty()){
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}