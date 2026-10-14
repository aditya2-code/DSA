class Solution {
    public String hashing(String s){
        StringBuilder hash = new StringBuilder();
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i =0; i< 26; i++){
            if(freq[i]!=0){
                hash.append(freq[i]);
            }
            hash.append('&');
        }
        return hash.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> mp  = new HashMap<>();
        for(int i =0; i< strs.length; i++){
            String key = hashing(strs[i]);
            if(!mp.containsKey(key)){
                mp.put(key,new ArrayList<>());
            }
            mp.get(key).add(strs[i]);
        }
        for(List<String> group: mp.values()){
            res.add(group);
        }
        return res;
    }
}