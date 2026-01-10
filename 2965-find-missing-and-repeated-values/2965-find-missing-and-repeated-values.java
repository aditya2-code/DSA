class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n*n;
        int counter[] = new int[size+1];
        for(int i = 0; i<n; i++){
            for(int j=0; j<n ;j++){
                counter[grid[i][j]]++;
            }
        }
        int result[] = new int[2];
        for(int i = 0; i<=size;i++){
            if(counter[i]==2){
                result[0] = i;
            }
            if(counter[i]==0){
                result[1] = i;
            }
        }
        return result;
    }
}