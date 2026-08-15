class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0; 
        int maxLen = 0;
        HashMap<Character,Integer> count = new HashMap<>();
        for(int right = 0; right<s.length(); right++){
            char c = s.charAt(right);
            count.put(c,count.getOrDefault(c,0)+1);
            while(count.get(c)>1){
                char leftC = s.charAt(left);
                count.put(leftC,count.get(leftC)-1);
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}