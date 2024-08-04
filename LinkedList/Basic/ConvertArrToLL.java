package Basic;

import Node.ListNode;

public class ConvertArrToLL {
    public static ListNode constructLL(int []arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;
        for(int i=1;i<arr.length;i++){
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static void PrintList(ListNode head) // Function to print the LinkedList
    {
        ListNode curr = head;
        for (; curr != null; curr = curr.next)
            System.out.print(curr.val + "-->");
        System.out.println("null");
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4};
        ListNode head = constructLL(arr);
        System.out.println("LinkedList : ");
        PrintList(head);
    }
}
