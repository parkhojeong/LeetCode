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
    public int diameterOfBinaryTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int max = 0;
        
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int diameter = dfs(node.left, 0) + dfs(node.right, 0);
            max = Math.max(diameter, max);

            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
        }

        return max;
    }

    private int dfs(TreeNode node, int depth) {
        if(node == null){
            return depth;
        }
        
        return Math.max(dfs(node.left, depth+1), dfs(node.right, depth+1));
    }
}