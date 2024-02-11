package programming_skills;

import java.util.HashMap;

public class AddLinkedList {

    public static void main(String[] args) {
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode head = result;
        int overflow = 0;

        while (l1.next != null && l2.next != null) {
            int v1 = 0;
            int v2 = 0;

            if (l1 == null) {
                v1 = 0;
                v2 = l2.val;
            } else if (l2 == null) {
                v1 = l1.val;
                v2 = 0;
            } else {
                v1 = l1.val;
                v2 = l2.val;
            }

            System.out.println(v1 + " " + v2);

            int val = v1 + v2 + overflow;
            if (val < 10) {
                result.val = val;
            } else {
                overflow = val / 10;
                result.val = val % 10;
            }

            //System.out.println((l1.next==null) + " " + (l2.next==null));

            if (l1.next == null && l2.next == null) {
                System.out.println("test");
                return head;
            } else {
                result.next = new ListNode();
                result = result.next;
            }

            l1 = l1.next;
            l2 = l2.next;
        }
        return head;
    }

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
}
