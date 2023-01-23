package linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveDupsTest {

    LinkedListNode head;

    @BeforeEach
    void setUp() {
        head = new LinkedListNode(1, null, null);
        LinkedListNode two = new LinkedListNode(2, null, head);
        LinkedListNode three = new LinkedListNode(3, null, two);
        LinkedListNode three2 = new LinkedListNode(3, null, three);
    }

    @Test
    void testRemoveDups() {
        System.out.println(head.printForward());
        RemoveDups.removeDups(head);
        System.out.println(head.printForward());
    }
}
