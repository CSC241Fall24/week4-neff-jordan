import org.w3c.dom.Node;

import java.util.List;

public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list

        ListNode newNode = new ListNode(val);

        if(head == null && position == 1) head = newNode;
        else if(position < 0 || position > size(head)) {
            ListNode ref = head;
            while(ref != null)
                ref = ref.next;
            ref.next = newNode;
        }
        else {

            int count = 0;
            ListNode ref = head;

            while(ref != null || count < position) {
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
        while(ref != null) {
            count++;
            ref = ref.next;
        }
        return count;
    }
}

/*
    Implement a function to insert a new node with a given value at a specified position in a linked list

 * Constraints:
 * – If the position is out of bounds, insert the node at the end of the list
 * – If the position is 1 or the list is empty, insert at the beginning
 */
