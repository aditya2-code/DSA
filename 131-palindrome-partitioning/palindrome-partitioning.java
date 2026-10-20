class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        backtrack(s,0,new ArrayList<>(), ans);
        return ans;
    }

    public void backtrack(String s, int start, List<String> path, List<List<String>> ans){
        if(start == s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int end = start+1; end<= s.length();end++){
            if(isPalindrome(s,start,end-1)){
                path.add(s.substring(start,end));
                backtrack(s,end,path,ans);
                path.remove(path.size()-1);
            }
            
        }
    }
    public boolean isPalindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start++)!= s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}