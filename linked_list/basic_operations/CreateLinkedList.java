package linked_list.basic_operations;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {         // ListNode: constructor name - In Java: constructor name MUST have the same name as the class name 
        this.val = val;
    }
}

public class CreateLinkedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(12);
        ListNode node3 = new ListNode(14);

        node1.next = node2;
        node2.next = node3;

        // optional: print list
        ListNode cur = node1;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}
// Self-Notes: 

// ListNode is a class that represents one node in a linked list 
// When you create ListNode class, ListNode becomes a new type that you can use 
// Why is the type of 'next' ListNode? Cause next contains a reference to a ListNode
// this.val = val => put the value from the constructor parameter into the val variable of this object.