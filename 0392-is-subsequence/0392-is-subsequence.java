class Solution {
    public boolean isSubsequence(String s, String t) {
        int x = s.length();
        int y = t.length();
        int count = 0;
        int i = 0;
        
        // Fix: Add 'count < x' to stop as soon as s is fully matched
        while (i < y && count < x) {
            if (s.charAt(count) == t.charAt(i)) {
                count++;
            }
            // Optimization: 'i++' happens in both cases, so keep it clean
            i++;
        }
        
        // If count equals x, it means every character of s was found in order
        return count == x;
    }
}