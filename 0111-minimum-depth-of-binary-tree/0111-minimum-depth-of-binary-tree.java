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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        return dfs(root, 1);
    }

    private int dfs(TreeNode node, int depth) {
        if(node.left == null && node.right == null) {
            return depth;
        }

        if(node.left == null && node.right != null){
            return dfs(node.right, depth + 1);
        }

        if(node.left != null && node.right == null){
            return dfs(node.left, depth + 1);
        }

        return Math.min(dfs(node.left, depth+1), dfs(node.right, depth+1));
    }
}