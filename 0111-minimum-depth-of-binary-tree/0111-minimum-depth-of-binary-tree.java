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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        return bfs(root);

        // return dfs(root, 1);
    }

    int bfs(TreeNode node) {
        Queue<TreeNode> q = new ArrayDeque<>(); 
        q.add(node);
        
        int depth = 1;
        while(!q.isEmpty()) {
            List<TreeNode> list = new ArrayList<>();
            while(!q.isEmpty()){
                TreeNode n = q.poll();

                if(n.left == null && n.right == null) return depth;

                if(n.left != null) list.add(n.left);
                if(n.right != null) list.add(n.right);
            }

            for(int i = 0 ; i < list.size(); i++){
                q.add(list.get(i));
            }

            depth += 1;
        }

        return depth;

    }

    private int dfs(TreeNode node, int depth) {
        if(node.left == null && node.right == null) {
            return depth;
        }

        if(node.left == null && node.right != null){
            return dfs(node.right, depth + 1);
        }

        if(node.left != null && node.right == null){
            return dfs(node.left, depth + 1);
        }

        return Math.min(dfs(node.left, depth+1), dfs(node.right, depth+1));
    }
}