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
    public int maxDepth(TreeNode root) {
        // if(root==null){
        //     return 0;
        // }
        int longest=0;
        return dfs(root,longest);

    }

    public int dfs(TreeNode root, int longest){
        if(root==null){
            return 0;
        }
        int left= dfs(root.left, longest);
        int right=dfs(root.right,longest);

        return Math.max(longest,Math.max(left+1,right+1));
    }

}
