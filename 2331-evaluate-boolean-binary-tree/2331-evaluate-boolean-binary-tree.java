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
    public boolean evaluateTree(TreeNode root) {
        return dfs(root);
    }

    boolean dfs(TreeNode node){
        if(node.val == 1) return true;
        else if(node.val == 0) return false;

        boolean res1 = dfs(node.left);
        boolean res2 = dfs(node.right);

        if(node.val == 2) return res1 || res2;
        else return res1 && res2; 
    }
}