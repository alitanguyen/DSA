// https://leetcode.com/problems/reverse-linked-list/description/
// leetcode 206 easy 

// approach: take the current node, make it point backward, then move to the next node 

package linked_list;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReversedLinkedList {
    public ListNode reverseList(ListNode head) {

        // create 3 pointers 
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
        return head;

    }
}
