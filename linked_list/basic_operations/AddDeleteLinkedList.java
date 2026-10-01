// neetcode medium 

package linked_list.basic_operations;

public class AddDeleteLinkedList {

    // create a ListNode
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // create a LinkedList
    public class MyLinkedList {
        ListNode head;
        int size;

        // constructor
        MyLinkedList() {
            head = new ListNode(0);
            size = 0;
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                return -1;
            }
            ListNode cur = head.next;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            return cur.val;
        }

        public void addAtHead(int val) {
            // step 1: create a new node 
            ListNode newNode = new ListNode(val);

            // step 2: point the new node to the current first real node
            newNode.next = head.next;

            // step 3: make the new node part of the linked list and be the first real node
            head.next = newNode;

            // step 4: increase the number of real nodes
            size++;
        }

        public void addAtTail(int val) {
            // step 1: create a new node
            ListNode newNode = new ListNode(val);
            ListNode cur = head;

            // step 2: traverse from the dummy head to the last node, then append the new node
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;

            // step 3: increase the size
            size++;
        }

        public void addAtIndex(int index, int val) {
            if (index < 0 || index > size) {
                return;
            }
            ListNode cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }

            // create a new node
            ListNode newNode = new ListNode(val);
            newNode.next = cur.next;
            cur.next = newNode; 
            size++;
        }

        public void deleteAtIndex(int index) {
            if (index >= size || index < 0) {
                return; 
            }

            ListNode cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
            size--;
        }

        }
    }

// Self-note :
// Create a dummy head node = a helper note
// it is an extra node at the beginning that does not contain real data

// ListNode node = new ListNode(val); -> remember 2 things: 
// 1. creates a new ListNode object 
// 2. next is null -> why? cause in the constructor you only defined this.val = val, nothing about next. 
