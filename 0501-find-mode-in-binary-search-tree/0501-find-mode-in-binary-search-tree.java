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
    Map<Integer, Integer> modeMap = new HashMap<>();
    private int max = 0;

    public int[] findMode(TreeNode root) {
        dfs2(root);

        return modeMap.entrySet()
            .stream()
            .filter(entrySet -> entrySet.getValue() == max)
            .map(entrySet -> entrySet.getKey())
            .mapToInt(Integer::intValue)
            .toArray();
    }

    private void dfs2(TreeNode node) {
        if(node == null){
            return;
        }

        if(node.left != null)
            dfs2(node.left);

        int newVal = modeMap.getOrDefault(node.val, 0) + 1;
        modeMap.put(node.val, newVal);
        if(max < newVal) max = newVal;
        
        if(node.right != null) 
            dfs2(node.right);
    }
}