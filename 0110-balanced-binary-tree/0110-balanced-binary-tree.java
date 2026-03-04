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
    public boolean isBalanced(TreeNode root) {
        return dfs(root, 1) != -1;
    }

    private int dfs(TreeNode node, int depth) {
        if(node == null) {
            return depth;
        }

        int d1 = dfs(node.left, depth + 1);
        int d2 = dfs(node.right, depth + 1);

        if(d1 == -1 || d2 == -1){
            return -1;
        }

        if(Math.abs(d1 - d2) > 1) {
            return -1;
        }

        return Math.max(d1, d2);
    }
}