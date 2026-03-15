class Solution {
    public int[][] merge(int[][] intervals) {
        int n= intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> result= new ArrayList<>();
        result.add(intervals[0]);
        for (int i = 1; i < n; i++) {
          
          int[] lastInterval = result.get(result.size() - 1);
        
          // Check if the current interval overlaps with the last merged interval
          if (lastInterval[1] >= intervals[i][0] && lastInterval[1] <= intervals[i][1]) {
              // Merge the intervals by updating the end time of the last merged interval
              lastInterval[1] = intervals[i][1];
          }
          // If no overlap, add the current interval to the result
          else if (lastInterval[1] < intervals[i][0]) {
              result.add(intervals[i]);
          }
      }
    
      // Convert the result list to a 2D array and return
      return result.toArray(new int[result.size()][]);
    }
}