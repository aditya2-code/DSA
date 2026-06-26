class Solution {
    public int maxVowels(String s, int k) {
        int currentVowels = 0;
        
        // Step 1: Count vowels in the very first window of size k
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
        }
        
        int maxVowels = currentVowels;
        
        // Step 2: Slide the window across the rest of the string
        for (int i = k; i < s.length(); i++) {
            // Add the incoming character entering from the right
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
            // Remove the outgoing character leaving from the left
            if (isVowel(s.charAt(i - k))) {
                currentVowels--;
            }
            
            // Update the maximum count seen so far
            maxVowels = Math.max(maxVowels, currentVowels);
            
            // Optimization: If we find a window where all elements are vowels, we can exit early!
            if (maxVowels == k) {
                return k;
            }
        }
        
        return maxVowels;
    }
    
    // Helper method to keep vowel matching clean and fast
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}