package linkedlist;

import util.Common;

public class PrintKthToLast {

    public static int printKthToLast(LinkedListNode head, int k) {
        if (head == null) {
            return 0;
        }
        int index = printKthToLast(head.next, k) + 1;
        if (index == k) {
            System.out.println(k + "th to last node is " + head.data);
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        LinkedListNode head = Common.createLinkedListFromArray(array);
        for (int i = 0; i <= array.length + 1; i++) {
            printKthToLast(head, i);
        }
    }
}
