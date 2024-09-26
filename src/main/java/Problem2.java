import org.w3c.dom.Node;

import java.util.List;

public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        ListNode newNode = new ListNode(val);

        if (head == null || position <= 1) {
            newNode.next = head;
            return newNode;
        }

        else if (position > size(head)) {
            ListNode ref = head;
            while (ref.next != null) {  // Traverse to the last node
                ref = ref.next;
            }
            ref.next = newNode;
        }

        else {

            ListNode ref = head;
            int count = 1;

            while (ref != null && count < position - 1) {
                ref = ref.next;
                count++;
            }
            newNode.next = ref.next;
            ref.next = newNode;
        }
        return head;
    }
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