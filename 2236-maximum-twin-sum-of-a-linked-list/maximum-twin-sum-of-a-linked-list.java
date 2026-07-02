/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head = head.next;
        }
        int l = 0;
        int r = arr.size()-1;
        int maxSum = 0;
        while(l<r){
            int sum = arr.get(l)+arr.get(r);
            l++;
            r--;
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}