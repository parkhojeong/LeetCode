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
    int sum = 0;
    public int sumRootToLeaf(TreeNode root) {
        dfs(root, "");
        return sum;
    }

    void dfs(TreeNode node, String prev) {
        if(node.left == null && node.right == null) {
            sum += Integer.parseInt(prev + node.val, 2);
            return;
        }

        if(node.left != null) dfs(node.left, prev + node.val);
        if(node.right != null) dfs(node.right, prev + node.val);
    }
}