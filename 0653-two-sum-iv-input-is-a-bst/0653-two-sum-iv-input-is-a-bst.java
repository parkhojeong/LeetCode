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
        int min = Integer.MAX_VALUE;

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.left == null && node.right == null){
                if(node.val < min) min = node.val;
                else if(min + node.val > k) return false;

                if(map.getOrDefault(k - node.val, 0) - 1 >= 0){
                    return true;
                }

                map.put(node.val, map.getOrDefault(node.val, 0) + 1);
                continue;
            }

            

            if(node.right != null) stack.push(node.right);
            stack.push(node);
            if(node.left != null) stack.push(node.left);

            node.left = null;
            node.right = null;
        }
        
        return false;
    }
}