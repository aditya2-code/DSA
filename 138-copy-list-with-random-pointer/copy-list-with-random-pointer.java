/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }

        Node temp = head;
        while(temp!=null){
            Node cloneNode = new Node(temp.val);
            cloneNode.next = temp.next;
            temp.next = cloneNode;
            temp = cloneNode.next;
        }

        temp = head;

        while(temp!=null){
            Node cloneNode = temp.next;
            if(temp.random!=null){
                cloneNode.random = temp.random.next;
            }
            temp = cloneNode.next;
        }

        temp = head;
        Node cloneHead = head.next;
        while(temp!=null){
            Node cloneNode = temp.next;
            temp.next = cloneNode.next;
            if(cloneNode.next!=null){
                cloneNode.next = cloneNode.next.next;
            }
            temp = temp.next;
        }
        return cloneHead;
    }
}