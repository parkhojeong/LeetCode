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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return bfs(root, targetSum);
        // return dfs(root, 0, targetSum);
    }

    boolean bfs(TreeNode node, int targetSum) {
        if(node == null) return false;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(node);

        while(!q.isEmpty()){
            List<TreeNode> list = new ArrayList<>();
            while(!q.isEmpty()){
                list.add(q.poll());
            }

            for(int i = 0; i < list.size(); i++){
                TreeNode n = list.get(i);
                if(n.left == null && n.right == null && n.val == targetSum) return true;

                if(n.left != null){
                    n.left.val += n.val;
                    q.add(n.left);
                }
                if(n.right != null){
                    n.right.val += n.val;
                    q.add(n.right);
                }
            }
        }

        return false;
    }

    private boolean dfs(TreeNode node, int sum, int targetSum) {
        if(node == null) {
            return false;
        }

        if(node.left == null && node.right == null){
            return sum + node.val == targetSum;
        }

        return dfs(node.left, sum + node.val, targetSum) || dfs(node.right, sum + node.val, targetSum ) ;
    }
}