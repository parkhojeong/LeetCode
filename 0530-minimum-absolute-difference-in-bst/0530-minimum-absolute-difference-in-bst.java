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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> arr = dfs(root);
        
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < arr.size(); i++){
            int diff = Math.abs(arr.get(i) - arr.get(i-1));
            min = Math.min(diff, min);
        }

        return min;
    }

    private List<Integer> dfs(TreeNode node) {
        List<Integer> arr = new ArrayList<>();
        if(node == null){
            return arr;
        }

        arr.addAll(dfs(node.left));
        arr.add(node.val);
        arr.addAll(dfs(node.right));

        return arr;
    }

}