import java.util.Arrays;

class Solution {
    public int numberOfSubstrings(String s) {
        // Array to store the last seen index of 'a', 'b', and 'c'
        int[] lastPos = new int[3];
        // Initialize with -1 to represent that they haven't been seen yet
        Arrays.fill(lastPos, -1);
        
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // Update the last seen position of the current character
            lastPos[s.charAt(i) - 'a'] = i;
            
            // Find the minimum of the last seen positions of 'a', 'b', and 'c'
            int minPos = Math.min(lastPos[0], Math.min(lastPos[1], lastPos[2]));
            
            // If all three characters have been seen at least once (minPos > -1)
            if (minPos != -1) {
                // Every substring starting from index 0 up to minPos and ending at i is valid
                count += minPos + 1;
            }
        }
        
        return count;
    }
}