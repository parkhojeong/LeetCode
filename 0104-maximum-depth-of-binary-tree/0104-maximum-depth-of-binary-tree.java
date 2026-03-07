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
        return bfs(root);

        // return dfs(root, 0);
    }

    private int bfs(TreeNode root) {
        if(root == null) return 0;
        
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int depth = 0;

        while(!q.isEmpty()){
            Queue<TreeNode> q2 = new ArrayDeque<>();
            while(!q.isEmpty()) {
                q2.add(q.poll());
            }

            while(!q2.isEmpty()){
                TreeNode n = q2.poll();
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
            }

            depth++;
        }

        return depth;
    }

    private int dfs(TreeNode node, int depth){
        if(node == null) {
            return depth;
        }

        return Math.max(dfs(node.left, depth+1), dfs(node.right, depth+1));
    }
}