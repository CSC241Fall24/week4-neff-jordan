import java.util.List;

public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list

        if(position < 0) {
            ListNode r = head;
            while(r != null) {
                r = r.next;
            }
            r.next = new ListNode(val);
        } else if(position == 1 || head == null) {
            head.next = new ListNode(val);
        } else {
            ListNode ref = head;
            int index = 0;
            while (index != position) {
                index++;
                ref = ref.next;
            }
            ref.next = new ListNode(val);
        }
        return head;
    }
}
