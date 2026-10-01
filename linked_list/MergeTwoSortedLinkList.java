// neetcode easy 
// https://neetcode.io/problems/merge-two-sorted-linked-lists/question?list=neetcode150

package linked_list;

public class MergeTwoSortedLinkList {
    // make a singly linked list 
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode (int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // make a dummy node = a faked node placed before the real list
        // to avoid the edge case of making an empty list
        ListNode dummy = new ListNode(0);

        // newNode and dummy point to the same node 
        ListNode newNode = dummy; 
        
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                newNode.next = list1;
                list1 = list1.next;             // move to the next node in list 1
            } else {
                newNode.next = list2;
                list2 = list2.next;
            }
            // move the list's pointer forward -> easily miss this line 
            newNode = newNode.next;
        }

        // edge cases
        if (list1 != null) {
            newNode.next = list1;
        } 
        if (list2 != null) {
            newNode.next = list2;
        }

        // skip the fake dummy node
        return dummy.next;
    }
}

