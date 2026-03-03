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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> output1 = new ArrayList<>();
        inorder(p, output1);
;
        List<Integer> output2 = new ArrayList<>();
        inorder(q, output2);
        return output1.equals(output2);
    
    }

    private void inorder(TreeNode n, List<Integer> l) {
        if(n == null){
            l.add(null);
            return;
        }

        l.add(n.val);
        inorder(n.left, l);
        inorder(n.right, l);
    }

}