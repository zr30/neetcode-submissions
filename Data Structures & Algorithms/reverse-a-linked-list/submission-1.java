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

        // Put all linked list values into ArrayList
        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }

        // Handle empty linked list
        if (arr.size() == 0) {
            return null;
        }

        // Create first node
        ListNode answer = new ListNode(arr.get(arr.size() - 1));
        ListNode current = answer;

        // Add remaining nodes
        for (int i = arr.size() - 2; i >= 0; i--) {
            current.next = new ListNode(arr.get(i));
            current = current.next;
        }

        return answer;
    }
}