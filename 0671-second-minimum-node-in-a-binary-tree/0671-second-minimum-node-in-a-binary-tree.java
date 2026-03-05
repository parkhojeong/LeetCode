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
    SortedSet<Integer> set = new TreeSet<>();
    
    public int findSecondMinimumValue(TreeNode root) {
        dfs(root);

        if(set.size() == 1){
            return -1;
        }
        
        set.removeFirst();
        return set.first();
    }

    void dfs(TreeNode root) {
        set.add(root.val);
        if(root.left != null) dfs(root.left);
        if(root.right != null) dfs(root.right);
    }
}