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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();

            boolean res = check(node, subRoot);
            if(res) return true;

            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
        }

        return false;
    }

    boolean check(TreeNode node1, TreeNode node2) {
        if(node1 == null && node2 == null){
            return true;
        }

        if( (node1 == null && node2 != null) || 
            (node1 != null && node2 == null) ||
            (node1.val != node2.val)
        ) {
            return false;
        }

        if(!check(node1.left, node2.left)) return false;
        if(!check(node1.right, node2.right)) return false;

        return true;
    }
}