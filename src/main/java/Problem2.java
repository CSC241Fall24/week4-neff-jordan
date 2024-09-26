import org.w3c.dom.Node;

import java.util.List;

public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        ListNode newNode = new ListNode(val);

        // Insert at the beginning or if the list is empty
        if (head == null || position <= 1) {
            newNode.next = head;
            return newNode; // New node becomes the head
        }

        // Insert at the end if the position is out of bounds
        else if (position > size(head)) {
            ListNode ref = head;
            while (ref.next != null) {  // Traverse to the last node
                ref = ref.next;
            }
            ref.next = newNode;
        }

        // Insert in the middle at the specified position
        else {
            ListNode ref = head;
            int count = 1;

            // Traverse until the node just before the position
            while (ref != null && count < position - 1) {
                ref = ref.next;
                count++;
            }

            // Insert the new node
            newNode.next = ref.next;
            ref.next = newNode;
        }

        return head;
    }

    // Method to calculate the size of the linked list
    public static int size(ListNode head) {
        ListNode ref = head;
        int count = 0;
        while (ref != null) {
            count++;
            ref = ref.next;
        }
        return count;
    }
}
