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
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, false);
    }

    public int dfs(TreeNode node, boolean isLeft) {
        int sum = 0;
        if(node.left == null && node.right == null) {
            if(isLeft) sum += node.val;

            return sum;
        }

        if(node.left != null) {
            sum += dfs(node.left, true);
        }

        if(node.right != null) {
            sum += dfs(node.right, false);
        }

        return sum;

    }
}