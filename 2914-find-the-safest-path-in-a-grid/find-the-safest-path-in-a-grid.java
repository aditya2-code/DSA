import java.util.*;

class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        
        // Edge cases: If start or end contains a thief, safeness factor is 0
        if (grid.get(0).get(0) == 1 || grid.get(n - 1).get(n - 1) == 1) {
            return 0;
        }
        
        // dist[r][c] will store the minimum Manhattan distance from (r, c) to any thief
        int[][] dist = new int[n][n];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        Queue<int[]> q = new LinkedList<>();
        
        // Step 1: Initialize Multi-Source BFS with all thief locations
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (grid.get(r).get(c) == 1) {
                    q.offer(new int[]{r, c});
                    dist[r][c] = 0;
                }
            }
        }
        
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        
        // Calculate shortest distance from each cell to any thief
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            
            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];
                
                if (nr >= 0 && nr < n && nc >= 0 && nc < n && dist[nr][nc] == Integer.MAX_VALUE) {
                    dist[nr][nc] = dist[r][c] + 1;
                    q.offer(new int[]{nr, nc});
                }
            }
        }
        
        // Step 2: Use Modified Dijkstra to find the maximum safeness factor path
        // Priority Queue stores elements as {safeness_factor, row, col}, sorted in descending order
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        
        // maxSafeness[r][c] tracks the maximum possible safeness factor to reach cell (r, c)
        int[][] maxSafeness = new int[n][n];
        for (int[] row : maxSafeness) {
            Arrays.fill(row, -1);
        }
        
        maxHeap.offer(new int[]{dist[0][0], 0, 0});
        maxSafeness[0][0] = dist[0][0];
        
        while (!maxHeap.isEmpty()) {
            int[] curr = maxHeap.poll();
            int currentSafeness = curr[0];
            int r = curr[1];
            int c = curr[2];
            
            // If we reached the destination, return the answer
            if (r == n - 1 && c == n - 1) {
                return currentSafeness;
            }
            
            // If we found a worse path to an already optimally visited cell, skip it
            if (currentSafeness < maxSafeness[r][c]) {
                continue;
            }
            
            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];
                
                if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                    // The safeness factor of a path is limited by the minimum value along it
                    int nextSafeness = Math.min(currentSafeness, dist[nr][nc]);
                    
                    if (nextSafeness > maxSafeness[nr][nc]) {
                        maxSafeness[nr][nc] = nextSafeness;
                        maxHeap.offer(new int[]{nextSafeness, nr, nc});
                    }
                }
            }
        }
        
        return 0;
    }
}