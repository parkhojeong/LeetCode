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
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        Map<Integer, Integer> map = new HashMap<>();

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.left == null && node.right == null){
                if(map.getOrDefault(k - node.val, 0) - 1 >= 0){
                    return true;
                }

                map.put(node.val, map.getOrDefault(node.val, 0) + 1);
                // do logic
                // System.out.println(node.val);
                continue;
            }

            TreeNode left = node.left;
            TreeNode right = node.right;
            node.left = null;
            node.right = null;

            if(right != null) stack.push(right);
            stack.push(node);
            if(left != null) stack.push(left);
        }

        // System.out.println(stack);
        // dfs(root);

        // for(int val: valToCountMap.keySet()){
        //     if(k == val * 2) {
        //         if(valToCountMap.getOrDefault(k, 0) >= 2) return true;
        //     }
        //     else if(valToCountMap.getOrDefault(k - val, 0) >= 1){
        //         return true;
        //     }
        // }
        
        return false;
    }

    void dfs(TreeNode node) {
        if(node.left != null) dfs(node.left);
    
        valToCountMap.put(node.val, valToCountMap.getOrDefault(node.val, 0) + 1);

        if(node.right != null) dfs(node.right);
    }
}