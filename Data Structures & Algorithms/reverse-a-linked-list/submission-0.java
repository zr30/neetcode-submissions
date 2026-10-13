/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();

        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }

        ListNode answer = null;
        ListNode current = null;

        for (int i = arr.size() - 1; i >= 0; i--) {
            ListNode newNode = new ListNode(arr.get(i));
            if (answer == null) {
                answer = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = newNode;
            }
        }

        return answer;
    }
}
