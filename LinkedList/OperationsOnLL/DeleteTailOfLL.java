package OperationsOnLL;

import Node.ListNode;

public class DeleteTailOfLL {
    private static ListNode deleteTail(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
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

        head = deleteTail(head);

        printLL(head);
    }
}
