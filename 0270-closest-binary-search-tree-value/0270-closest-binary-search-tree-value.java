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
    public int closestValue(TreeNode root, double target) {
        return dfs(root, target);
    }

    private int dfs(TreeNode node, double target) {
        int val = node.val;
        if(node.left == null && node.right == null){
            return val;
        }

        if(node.left != null) {
            int d1 = dfs(node.left, target);

            double diff1 = Math.abs(target - (double)d1);
            double diff2 = Math.abs(target - (double)val);
            if(diff1 == diff2) {
                val = Math.min(val, d1);
            } else if (diff1 < diff2) {
                val = d1;
            }
        }

        if(node.right != null) {
            int d2 = dfs(node.right, target);
            
            double diff1 = Math.abs(target - (double)d2);
            double diff2 = Math.abs(target - (double)val);
            if(diff1 == diff2) {
                val = Math.min(val, d2);
            } else if (diff1 < diff2) {
                val = d2;
            }
        }

        return val;
    }
}