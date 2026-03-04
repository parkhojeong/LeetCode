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
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }

        return Math.max(bfs(root.left, 1), bfs(root.right, 1));
    }

    private int bfs(TreeNode node, int depth){
        if(node == null) {
            return depth;
        }

        return Math.max(bfs(node.left, depth+1), bfs(node.right, depth+1));
    }
}