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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> output = new ArrayList<>();

        if (root == null) {
            return output;
        }

        q.add(root);

        while (!q.isEmpty()) {
            List<TreeNode> subarray = new ArrayList<>();

            while (!q.isEmpty()) {
                subarray.add(q.poll());
            }

            for (int i = 0; i < subarray.size(); i++) {
                TreeNode curr = subarray.get(i);

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

            List<Integer> level = new ArrayList<>();

            for (TreeNode node : subarray) {
                level.add(node.val);
            }

            output.add(level);
        }

        return output;
    }
}

