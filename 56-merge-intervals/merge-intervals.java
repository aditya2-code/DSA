class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1){
            return intervals;
        }
        List<int[]> intervalsList = new ArrayList<>(Arrays.asList(intervals));
        boolean mergedSomething = true;

        while(mergedSomething){
            mergedSomething = false;
            List<int[]> temp = new ArrayList<>();

            while(!intervalsList.isEmpty()){
                int []curr = intervalsList.remove(0);
                boolean isMerged = false;
                for(int i =0; i<intervalsList.size();i++){
                    int[] other = intervalsList.get(i);

                    if(Math.max(curr[0],other[0])<=Math.min(curr[1],other[1])){
                        curr = new int[]{Math.min(curr[0],other[0]),Math.max(curr[1],other[1])};
                        intervalsList.remove(i);
                        isMerged = true;
                        mergedSomething = true;
                        break;
                    }
                }
                temp.add(curr);
            }
            intervalsList = temp;

        }
        return intervalsList.toArray(new int[intervalsList.size()][]);
    }
}