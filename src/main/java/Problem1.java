// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2

        ListNode ref = l1;

        //get to the end of l1 list
        while(ref.next != null) {
            ref = ref.next;
        }

        while(l2 != null) {
            ListNode newNode = new ListNode(l2.val);
            ref.next = newNode;
            ref = ref.next;
            l2 = l2.next;
        }


        return l1;
    }
}