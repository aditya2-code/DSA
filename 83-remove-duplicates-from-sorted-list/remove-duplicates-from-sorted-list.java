class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // FIX: If the input list is empty, return null immediately 
        // to prevent checking ".next" on a null reference.
        if (head == null) {
            return null;
        }
        
        ListNode node = head;
        
        while (node.next != null) {
            if (node.val == node.next.val) {
                // Duplicate detected: bypass the duplicate node
                node.next = node.next.next;
            } else {
                // No duplicate: only advance the pointer when values change
                node = node.next;
            }
        }
        
        return head;
    }
}