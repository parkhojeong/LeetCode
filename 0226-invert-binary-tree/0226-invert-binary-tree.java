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
    public TreeNode invertTree(TreeNode root) {
        bfs(root);
        // invert(root);

        return root;
    }

    void bfs(TreeNode node) {
        if(node == null) return;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(node);

        while(!q.isEmpty()){
            TreeNode n = q.poll();
            TreeNode temp = n.left;
            n.left = n.right;
            n.right = temp;

            if(n.left != null) q.add(n.left);
            if(n.right != null) q.add(n.right);
        }
    }

    private void invert(TreeNode node){
        if(node == null){
            return;
        }

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        invert(node.left);
        invert(node.right);
    }
}