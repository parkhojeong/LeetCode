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
        return bfs(root);
        // return dfs(root, false);
    }

    int bfs(TreeNode node) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(node);
        int sum = 0;

        while(!q.isEmpty()) {
            TreeNode n = q.poll();
            if(n.left != null && n.left.left == null && n.left.right == null){
                sum += n.left.val;
            }

            if(n.left != null) q.add(n.left);
            if(n.right != null) q.add(n.right);
        }

        return sum;
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