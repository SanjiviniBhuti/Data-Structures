package OperationsOnLL;

import Node.ListNode;

public class InsertKElementLL {
    private static ListNode insertKElement(ListNode head, int ele, int k) {
        if(head == null) {
            if(k == 1) {
                return new ListNode(ele);
            }
            else {
                return head;
            }
        }
        if(k == 1){
            return new ListNode(ele);
        }
        int cnt = 0;
        ListNode temp = head;
        while(temp != null) {
            cnt++;
            if(cnt == k-1) {
                ListNode node = new ListNode(ele, temp.next);
                temp.next = node;
                break;
            }
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

        head = insertKElement(head, 1, 1);
        printLL(head);

        System.out.println();

        head = insertKElement(head, 1, 6);
        printLL(head);

        System.out.println();

        head = insertKElement(head, 2, 3);
        printLL(head);
    }
}
