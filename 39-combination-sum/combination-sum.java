class Solution {  
    private void fun(int[] candidates, int remaining, int ptr, List<Integer> curr, List<List<Integer>> res) {
        // Base Case: Target achieved
        if (remaining == 0) {
            res.add(new ArrayList<>(curr)); // Capture explicit snapshot copy
            return;
        }

        // Loop forward from the tracking pointer to the end of the array
        for (int poss = ptr; poss < candidates.length; poss++) {
            // CRITICAL OPTIMIZATION: Since the array is sorted, if the current element 
            // is greater than remaining, all elements to the right are guaranteed to be too large.
            if (candidates[poss] > remaining) break; 
            
            curr.add(candidates[poss]);
            
            // Pass 'poss' to allow the same element to be chosen repeatedly
            fun(candidates, remaining - candidates[poss], poss, curr, res);
            
            curr.remove(curr.size() - 1); // Backtrack state
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates); // Prerequisite for the break condition optimization
        List<List<Integer>> res = new ArrayList<>();
        fun(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }
}