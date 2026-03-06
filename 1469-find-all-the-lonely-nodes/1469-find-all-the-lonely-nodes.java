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
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> arr = new ArrayList<>();

        if(root.left != null && root.right == null) arr.add(root.left.val);
        if(root.left == null && root.right != null) arr.add(root.right.val);

        if(root.left != null) arr.addAll(getLonelyNodes(root.left));
        if(root.right != null) arr.addAll(getLonelyNodes(root.right));

        return arr;
    }
}