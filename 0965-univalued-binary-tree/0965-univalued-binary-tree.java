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
    public boolean isUnivalTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        stack.add(root);

        TreeNode cur;
        while(!stack.isEmpty()){
            cur = stack.pop();
            
            
            if(cur.left == null && cur.right == null) {
                // System.out.println(cur.val);
                set.add(cur.val);

                if(set.size() >= 2) return false;
                continue;
            }

            if(cur.right != null) stack.push(cur.right);
            stack.push(cur);
            if(cur.left != null) stack.push(cur.left);

            cur.left = cur.right = null;
        }

        return true;
    }
}