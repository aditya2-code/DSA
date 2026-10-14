class Solution {
    public String reverseWords(String s) {
        String str = "";
        String ans = "";
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)==' ' && !str.isEmpty()){
                ans = str +' '+ ans;
                str = "";
            }if(s.charAt(i)==' '){
                continue;
            }else{
                str = str+s.charAt(i);
            }
        }
        if(str!=" "){
            ans = str+ ' '+ ans;
        }
        return ans.trim();
    }
}