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
    public boolean isSymmetric(TreeNode root) {
        return bfs(root);
        // return dfs(root.left, root.right);
    }

    boolean bfs(TreeNode node) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(node);

        while(!q.isEmpty()) {
            List<TreeNode> list = new ArrayList<>();
            while(!q.isEmpty()){
                list.add(q.poll());
            }

            int left = 0;
            int right = list.size() - 1;
            while(left < right){
                TreeNode n1 = list.get(left);
                TreeNode n2 = list.get(right);

                if(n1.val != n2.val) return false;

                left++;
                right--;
            }

            boolean areAllLeaves = true;
            for(int i = 0; i < list.size(); i++){
                TreeNode n = list.get(i);
                if(n.left != null || n.right != null) areAllLeaves = false;
            }
            if(areAllLeaves) break;

            for(int i = 0; i < list.size(); i++){
                TreeNode n = list.get(i);
                if(n.left == null) q.add(new TreeNode(-1000));
                else q.add(n.left);

                if(n.right == null) q.add(new TreeNode(-1000));
                else q.add(n.right);    
            }
        }

        return true;
    }

    private boolean dfs(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) {
            return true;
        }

        if(root1 == null || root2 == null) {
            return false;
        }

        if(root1.val != root2.val) {
            return false;
        }

        return dfs(root1.left, root2.right) && dfs(root1.right, root2.left);
    }
}