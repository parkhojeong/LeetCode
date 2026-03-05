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
    TreeNode output;
    TreeNode cur;

    public TreeNode increasingBST(TreeNode root) {
        dfs(root);

        return output;
    }

    void dfs(TreeNode node) {
        if(node.left != null) dfs(node.left);
        
        if(cur == null) {
            output = cur = new TreeNode(node.val);             
        } else {
            cur.right = new TreeNode(node.val);
            cur = cur.right;
        }

        if(node.right != null) dfs(node.right);
    }
}