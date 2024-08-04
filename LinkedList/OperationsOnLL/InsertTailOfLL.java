package OperationsOnLL;

import Node.ListNode;

public class InsertTailOfLL {
    private static ListNode InsertTail(ListNode head, int t) {
        if(head == null)
            return new ListNode(t);
        ListNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        ListNode newNode = new ListNode(t);
        temp.next = newNode;
        return head;
    }

    private static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};

        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);
        head.next.next.next = new ListNode(arr[3]);

        head = InsertTail(head, 9);

        printLL(head);
    }
}
