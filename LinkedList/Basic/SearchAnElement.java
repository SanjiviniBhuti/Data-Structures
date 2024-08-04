package Basic;

import Node.ListNode;

public class SearchAnElement {
    public static int searchInLinkedList(ListNode head, int k)
    {
        ListNode mover = head;
        while(mover != null) {
            if(mover.val == k){
                return 1;
            }
            mover = mover.next;
        }
        return 0;
    }

    static ListNode InsertAtFirst(int value, ListNode head) {

        // Step1 : creating a new Node with the given val
        ListNode newnode = new ListNode(value);

        // Step2 : Making next of newly created Node to point the head of LinkedList
        newnode.next = head;

        // Making the newly created Node as head
        head = newnode;
        return head;
    }

    public static void main(String args[]) {
        ListNode head = null;
        head = InsertAtFirst(40, head);
        head = InsertAtFirst(30, head);
        head = InsertAtFirst(20, head);
        head = InsertAtFirst(10, head);
        String res = (searchInLinkedList(head,40) == 1 ? "Present":"Not Present");
        System.out.println("Element is "+res);

        res = (searchInLinkedList(head,50) == 1 ? "Present":"Not Present");
        System.out.println("Element is "+res);
    }
}
