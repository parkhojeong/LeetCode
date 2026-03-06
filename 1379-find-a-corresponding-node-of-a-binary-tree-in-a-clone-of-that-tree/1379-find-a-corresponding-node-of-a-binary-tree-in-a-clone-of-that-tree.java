/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == target) {
            return cloned;
        }

        TreeNode res1 = null;
        if(original.left != null) res1 = getTargetCopy(original.left, cloned.left, target);
        if(res1 != null) return res1;
        
        TreeNode res2 = null;
        if(original.right != null) res2 = getTargetCopy(original.right, cloned.right, target);
        if(res2 != null) return res2;

        return null;
    }
}