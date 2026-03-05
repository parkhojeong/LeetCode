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
    Map<Integer, List<Long>> depthToValuesMap = new HashMap<>();

    public List<Double> averageOfLevels(TreeNode root) {
        
        dfs(root, 0);

        return depthToValuesMap
            .entrySet()
            .stream()
            .sorted((a, b) -> a.getKey() - b.getKey())
            .map((entry) -> 
                (double)entry.getValue().stream().reduce(0L, Long::sum) / entry.getValue().size())
            .toList();

    }

    void dfs(TreeNode node, Integer depth) {
        List<Long> list = depthToValuesMap.getOrDefault(depth, new ArrayList<>());
        list.add((long)node.val);
        depthToValuesMap.put(depth, list);

        if(node.left != null) {
            dfs(node.left, depth + 1);
        }

        if(node.right != null) {
            dfs(node.right, depth + 1);
        }
    }
}