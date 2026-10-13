class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] leftMin = new int[n];
        leftMin[0] = -1;
        Stack<Integer> leftStack = new Stack<>();
        leftStack.push(0);
        for(int i =1; i< n; i++){
            while(!leftStack.isEmpty() && heights[leftStack.peek()]>=heights[i]){
                leftStack.pop();
            }
            leftMin[i] = leftStack.isEmpty()? -1:leftStack.peek();
            leftStack.push(i);
        }
        int[] rightMin = new int[n];
        rightMin[n-1] = n;
        Stack<Integer> rightStack = new Stack<>();
        rightStack.push(n-1);
        for(int i = n-2; i>=0;i--){
            while(!rightStack.isEmpty() && heights[rightStack.peek()]>=heights[i]){
                rightStack.pop();
            }
            rightMin[i] = rightStack.isEmpty()? n:rightStack.peek();
            rightStack.push(i);
        }
        int maxArea = 0;
        for(int i = 0; i< n; i++){
            int width = (rightMin[i]-leftMin[i])-1;
            int area = width*heights[i];
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
}