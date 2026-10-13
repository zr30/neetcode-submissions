/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();

        getInOrder(root, arr);

        for (int i = 0; i < arr.size(); i++) {
            if (i == k - 1) {
                return arr.get(i);
            }
        }

        return 0;
    }

    public void getInOrder(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        getInOrder(root.left, arr);

        arr.add(root.val);

        getInOrder(root.right, arr);
    }
}