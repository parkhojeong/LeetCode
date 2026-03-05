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
    Map<Integer, Integer> valToCountMap = new HashMap<>();
    public boolean findTarget(TreeNode root, int k) {
        dfs(root);

        for(int val: valToCountMap.keySet()){
            if(k == val * 2) {
                if(valToCountMap.getOrDefault(k, 0) >= 2) return true;
            }
            else if(valToCountMap.getOrDefault(k - val, 0) >= 1){
                return true;
            }
        }
        
        return false;
    }

    void dfs(TreeNode node) {
        if(node.left != null) dfs(node.left);
    
        valToCountMap.put(node.val, valToCountMap.getOrDefault(node.val, 0) + 1);

        if(node.right != null) dfs(node.right);
    }
}