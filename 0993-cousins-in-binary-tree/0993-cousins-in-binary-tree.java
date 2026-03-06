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
    List<Object[]> list = new ArrayList<>();

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, null, x, y, 0);
        Object[] val1 = list.getFirst();
        Object[] val2 = list.getLast();
        return val1[0] != val2[0] && val1[1] == val2[1];
    }

    void dfs(TreeNode node, TreeNode parent, int x, int y, int depth) {
        if(x == node.val || y == node.val) {
            list.add(new Object[]{parent, depth});
        }

        if(node.left != null) dfs(node.left, node, x, y, depth+1);
        if(node.right != null) dfs(node.right, node, x, y, depth+1);

    }
}