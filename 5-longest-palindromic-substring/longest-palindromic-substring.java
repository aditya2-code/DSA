class Solution {
    public String longestPalindrome(String s) {
        String subString = "";
        for(int i = 0 ; i<s.length();i++){
            for(int j = s.length(); j>=i; j--){
                if(isPalindrome(s.substring(i,j))){
                    if(subString.length()<s.substring(i,j).length()){
                        subString = s.substring(i,j);
                    }
                }
            }
        }
        return subString;
        
    }
    public boolean isPalindrome(String s){
        int start = 0; 
        int end = s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}