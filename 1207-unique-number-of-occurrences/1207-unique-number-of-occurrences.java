class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: arr){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        HashMap<Integer, Integer> seen = new HashMap<>();
        for(int count: map.values()){
            seen.put(count,seen.getOrDefault(count,0)+1);
            if(seen.get(count)>1){
                return false;
            }
        }
        return true;
    }
}