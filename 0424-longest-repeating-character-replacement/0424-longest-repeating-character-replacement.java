class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0; 
        int maxFreq = 0;
        int res = 0;
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int j = 0; j<s.length(); j++){
            char c = s.charAt(j);
            freq.put(c,freq.getOrDefault(c,0)+1);
            maxFreq = Math.max(maxFreq,freq.get(c));
            while(j-i+1-maxFreq>k){
                char left = s.charAt(i);
                freq.put(left,freq.get(left)-1);
                i++;
            }
            res = Math.max(res,j-i+1);
        }
        return res;
    }
}