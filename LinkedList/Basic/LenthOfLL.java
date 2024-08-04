package Basic;

import Node.ListNode;

public class LenthOfLL {
    static int length(ListNode head){
        ListNode mover = head;
        int count = 0;
        while(mover != null) {
            count++;
            mover = mover.next;
        }
        return count;
    }

    static void PrintList(ListNode head) // Function to print the LinkedList
    {
        ListNode curr = head;
        for (; curr != null; curr = curr.next)
            System.out.print(curr.val + "-->");
        System.out.println("null");
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
        System.out.println("Linked List : ");
        PrintList(head);
        System.out.println("Length = "+length(head));
    }
}
