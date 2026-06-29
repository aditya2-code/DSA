class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i< n;i++){
             if(stack.isEmpty()){
                stack.push(s.charAt(i));
             }
             else{
                if((stack.peek()=='(' && s.charAt(i)==')')|| (stack.peek()=='[' && s.charAt(i)==']')||(stack.peek()=='{' && s.charAt(i)=='}')){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
             }
        }
        return stack.isEmpty();
        
    }
}