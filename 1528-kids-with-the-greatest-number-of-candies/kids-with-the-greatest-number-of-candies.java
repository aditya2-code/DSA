class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int ec) {
        int n = c.length;
        int max = 0;
        for(int i = 0; i< n; i++){
            if(c[i]> max){
                max = c[i];
            }
        }
        List<Boolean> res = new ArrayList<>();
        for(int i = 0; i< n ; i++){
            if(c[i]+ec>=max){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}