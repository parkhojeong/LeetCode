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
    public List<String> binaryTreePaths(TreeNode root) {
        return dfs(root, "" + root.val);
    }

    public List<String> dfs(TreeNode node, String prev) {
        List<String> arr = new ArrayList<>();
        if(node.left == null && node.right == null){
            arr.add(prev);
            return arr;
        }

        if(node.left != null) {
            arr.addAll(dfs(node.left, prev + "->" + node.left.val));
        }
        if(node.right != null) {
            arr.addAll(dfs(node.right, prev + "->" + node.right.val));
        }
        
        return arr;
    }
}