package OperationsOnLL;

import Node.ListNode;

public class DeleteKElementOfLL {
    private static ListNode deleteKElement(ListNode head, int k) {
        if(head == null) {
            return head;
        }
        if(k == 1) {
            head = head.next;
            return head;
        }
        int cnt = 0;
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            cnt++;
            if(cnt == k) {
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7, 9, 6};

        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);
        head.next.next.next = new ListNode(arr[3]);
        head.next.next.next.next = new ListNode(arr[4]);
        head.next.next.next.next.next = new ListNode(arr[5]);

        head = deleteKElement(head, 3);
        printLL(head);

        System.out.println();

        head = deleteKElement(head, 1);
        printLL(head);

        System.out.println();

        head = deleteKElement(head, 4);
        printLL(head);
    }
}
