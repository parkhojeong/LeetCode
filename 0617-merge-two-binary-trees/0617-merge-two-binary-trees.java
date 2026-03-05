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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null){
            return null;
        }
        TreeNode node = new TreeNode();
        dfs(node, root1, root2);
        return node;
    }

    void dfs(TreeNode node, TreeNode node1, TreeNode node2) {
        if(node1 == null && node2 != null) {
            node.val = node2.val;
        } else if(node1 != null && node2 == null) {
            node.val = node1.val;
        } else {
            node.val = node1.val + node2.val;
        }

        if(node1 != null && node1.left != null) {
            node.left = new TreeNode(node1.left.val);

            if(node2 != null && node2.left != null) {

                dfs(node.left, node1.left, node2.left);
            } else {
                dfs(node.left, node1.left, null);
            }
            
        } else if(node2 != null && node2.left != null) {
            node.left = new TreeNode(node2.left.val);

            if(node1 != null && node1.left != null) {
                dfs(node.left, node1.left, node2.left);
            }else{
                dfs(node.left, null, node2.left);
            }
        }

        if(node1 != null && node1.right != null) {
            node.right = new TreeNode(node1.right.val);

            if(node2 != null && node2.right != null) {
                dfs(node.right, node1.right, node2.right);
            } else {
                dfs(node.right, node1.right, null);
            }
        
            
        } else if(node2 != null && node2.right != null) {
            node.right = new TreeNode(node2.right.val);

            if(node1 != null && node1.right != null) {
                dfs(node.right, node1.right, node2.right);
            } else {
                dfs(node.right, null, node2.right);
            }

        }
    }
}