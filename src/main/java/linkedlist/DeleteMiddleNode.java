package linkedlist;

import util.Common;

public class DeleteMiddleNode {

    public static boolean deleteNode(LinkedListNode midNode) {
        if (midNode == null || midNode.next == null) {
            return false;
        }
        LinkedListNode next = midNode.next;
        midNode.data = next.data;
        midNode.next = next.next;
        return true;
    }

    public static void main(String[] args) {
        LinkedListNode head = Common.randomLinkedList(10, 0, 10);
        System.out.println(head.printForward());
        deleteNode(head.next.next.next.next);
        System.out.println(head.printForward());
    }
}
