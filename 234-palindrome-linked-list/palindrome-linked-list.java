
class Solution {
    public ListNode reverse(ListNode node){
        ListNode curr = node;
        ListNode prev = null;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast!=null &&fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode rev = reverse(slow.next);
        slow.next = null;
        while(rev!= null){
            if(head.val != rev.val){
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
        return true;
    }
}