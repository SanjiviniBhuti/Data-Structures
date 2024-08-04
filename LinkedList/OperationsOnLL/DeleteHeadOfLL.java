package OperationsOnLL;

import Node.ListNode;

class DeleteHeadOfLL {
    private static ListNode deleteHead(ListNode head) {
        if(head == null)
            return head;
        head = head.next;
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

        head = deleteHead(head);

        printLL(head);
    }
}
