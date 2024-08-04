package solve;

import Node.ListNode;

public class MergeTwoSortedLists {

    static ListNode merge(ListNode list1, ListNode list2) {

        ListNode node = new ListNode(-1);
        ListNode temp = node;

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            }
            else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1 != null) {
            temp.next = list1;
        }
        if(list2 != null) {
            temp.next = list2;
        }
        return node.next;
    }
    static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            // Print the data of the current node
            System.out.print(temp.val + " -> ");
            // Move to the next node
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println();
    }

    public static void main(String args[]) {
        int[] list1 = {1, 3, 5, 7};
        ListNode head1 = new ListNode(list1[0]);
        head1.next = new ListNode(list1[1]);
        head1.next.next = new ListNode(list1[2]);
        head1.next.next.next = new ListNode(list1[3]);

        int[] list2 = {2, 4, 6, 8};
        ListNode head2 = new ListNode(list2[0]);
        head2.next = new ListNode(list2[1]);
        head2.next.next = new ListNode(list2[2]);
        head2.next.next.next = new ListNode(list2[3]);

        ListNode head3 = merge(head1, head2);
        System.out.println("LinkedList : ");
        printList(head3);
    }
}
