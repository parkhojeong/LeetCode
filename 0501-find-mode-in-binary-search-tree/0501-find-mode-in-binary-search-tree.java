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
    public int[] findMode(TreeNode root) {
        List<Integer> arr = dfs2(root);
        System.out.println(arr);

        Map<Integer, Integer> modeMap = new HashMap<>();
        int max = 0;
        for(int i = 0; i < arr.size(); i++){
            int val = arr.get(i);
            int newCount = modeMap.getOrDefault(val, 0) + 1;
            modeMap.put(val, newCount);

            if(newCount > max) {
                max = newCount;
            }
        }
        
        final int maxVal = max;
        return modeMap.entrySet()
            .stream()
            .filter((entrySet) -> entrySet.getValue() == maxVal)
            .map(entrySet -> entrySet.getKey())
            .mapToInt(Integer::intValue)
            .toArray();
    }

    private List<Integer> dfs2(TreeNode node) {
        List<Integer> arr = new ArrayList<>();
        if(node == null){
            return arr;
        }

        if(node.left != null)
            arr.addAll(dfs2(node.left));

        arr.add(node.val);
        
        if(node.right != null) 
            arr.addAll(dfs2(node.right));

        return arr;
    }
}