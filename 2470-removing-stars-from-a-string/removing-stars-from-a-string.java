class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch != '*') {
                // Equivalent to stack.push()
                sb.append(ch);
            } else {
                // Equivalent to stack.pop()
                // Only pop if the builder isn't empty to prevent errors
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }
        
        // No reversal or extra looping required!
        return sb.toString();
    }
}