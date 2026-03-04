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
    public int findTilt(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        dfs(root);
        return sumDfs(root);
    }

    int dfs(TreeNode node) {
        int leftSum = 0;
        if(node.left != null) {
            leftSum = dfs(node.left);
        }

        int rightSum = 0;
        if(node.right != null) {
            rightSum = dfs(node.right);
        }

        int val = node.val;
        node.val = Math.abs(leftSum - rightSum);

        return val + leftSum + rightSum;
    }

    int sumDfs(TreeNode node){
        int sum = 0;
        if(node.left != null){
            sum += sumDfs(node.left);
        }

        if(node.right != null){
            sum += sumDfs(node.right);
        }

        sum += node.val;
        return sum;
    }
}