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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr.val == subRoot.val && isMatch(curr, subRoot)) {
                return true;
            }

            if (curr.left != null) {
                q.add(curr.left);
            }

            if (curr.right != null) {
                q.add(curr.right);
            }
        }

        return false;
    }

    public boolean isMatch(TreeNode curr, TreeNode sub) {
        if (curr == null && sub == null) {
            return true;
        }

        if (curr == null || sub == null) {
            return false;
        }

        if (curr.val != sub.val) {
            return false;
        }

        return isMatch(curr.left, sub.left) &&
               isMatch(curr.right, sub.right);
    }
}