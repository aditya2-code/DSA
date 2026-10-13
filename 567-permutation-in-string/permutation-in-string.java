class Solution {
    public boolean freqSame(int[] freq, int[] wFreq){
        for(int i = 0; i<26; i++){
            if(freq[i]!= wFreq[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        for(int i = 0; i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        int ws = s1.length();
        for(int i = 0; i< s2.length(); i++){
            int wi = 0;
            int idx = i;
            int [] wFreq = new int[26];
            while(wi<ws && idx< s2.length()){
                wFreq[s2.charAt(idx)-'a']++;
                idx++;
                wi++; 
            }
            if(freqSame(freq,wFreq)){
                return true;
            }
        }
        return false;
    }
}